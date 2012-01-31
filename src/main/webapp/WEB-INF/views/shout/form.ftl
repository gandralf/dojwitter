<#if errors??>
    <#list errors as error>
    ${error.category} - ${error.message}<br/>
    </#list>
</#if>

<form action="${base}/shouts" method="post">

<#if shout.id??>
    <input type="hidden" name="shout.id" value="${shout.id}"/>
    <input type="hidden" name="_method" value="put"/>
</#if>

    <div class="field">
        Content:<br/>
        <@html.text "shout.content" shout.content/>
    </div>
    <div class="actions">
        <button type="submit">send</button>
    </div>
</form>

<a href="${base}/shouts">Back</a>

