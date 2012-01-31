<body>
<h1>Listing Shouts</h1>

<table>
    <tr>
        <th>Content</th>
        <th></th>
        <th></th>
        <th></th>
    </tr>

<#list shoutList as shout>
    <tr>
        <td>
        ${shout.content!""}

        </td>
        <td><a href="${base}/shouts/${shout.id}">show</a></td>
        <td><a href="${base}/shouts/${shout.id}/edit">edit</a></td>
        <td>
            <form action="${base}/shouts/${shout.id}" method="post">
                <input type="hidden" name="_method" value="delete"/>
                <button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
            </form>
        </td>
    </tr>
</#list>
</table>

<br/>
<a href="${base}/shouts/new">New Shout</a>
</body>
