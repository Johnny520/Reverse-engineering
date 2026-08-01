package bsh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;
import org.apache.commons.lang3.CharSet;
import org.apache.commons.lang3.text.StrBuilder;
import p359.InterfaceC8921;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2663 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7972;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7973;

    public /* synthetic */ C2663(Object obj, int i) {
        this.f7973 = i;
        this.f7972 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f7973;
        Object obj2 = this.f7972;
        switch (i) {
            case 0:
                This.initClassInstanceThis((GeneratedClass) obj2, (String) obj);
                break;
            case 1:
                ((ArrayList) obj2).add((Constructor) obj);
                break;
            case 2:
                Field field = (Field) obj;
                ((HashMap) obj2).put(field.getName(), field);
                break;
            case 3:
                ((CharSet) obj2).add((String) obj);
                break;
            case 4:
                ((StrBuilder) obj2).append(obj);
                break;
            case 5:
                ((AndFileFilter) obj2).addFileFilter((InterfaceC8921) obj);
                break;
            default:
                ((OrFileFilter) obj2).addFileFilter((InterfaceC8921) obj);
                break;
        }
    }
}
