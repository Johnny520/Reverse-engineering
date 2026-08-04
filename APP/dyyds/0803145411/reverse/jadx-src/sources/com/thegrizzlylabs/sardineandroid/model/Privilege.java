package com.thegrizzlylabs.sardineandroid.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root(strict = false)
public class Privilege {

    @ElementListUnion({@ElementList(entry = "read", inline = true, type = Read.class), @ElementList(entry = "write", inline = true, type = Write.class), @ElementList(entry = "write-properties", inline = true, type = WriteProperties.class), @ElementList(entry = "write-content", inline = true, type = WriteContent.class), @ElementList(entry = "unlock", inline = true, type = Unlock.class), @ElementList(entry = "read-acl", inline = true, type = ReadAcl.class), @ElementList(entry = "write-acl", inline = true, type = WriteAcl.class), @ElementList(entry = "bind", inline = true, type = Bind.class), @ElementList(entry = "unbind", inline = true, type = UnBind.class), @ElementList(entry = "read-current-user-privilege-set", inline = true, type = ReadCurrentUserPrivilegeSet.class), @ElementList(entry = "all", inline = true, type = All.class), @ElementList(entry = "write_acl", inline = true, type = WriteAcl.class), @ElementList(entry = "read_acl", inline = true, type = ReadAcl.class)})
    private List<SimplePrivilege> content;

    public List<SimplePrivilege> getContent() {
        List<SimplePrivilege> list = this.content;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.content = arrayList;
        return arrayList;
    }

    public void setContent(List<SimplePrivilege> list) {
        this.content = list;
    }
}
