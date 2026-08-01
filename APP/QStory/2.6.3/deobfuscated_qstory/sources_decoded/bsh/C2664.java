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
import p359.InterfaceC8911;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2664 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7974;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7975;

    public /* synthetic */ C2664(Object obj, int i) {
        this.f7975 = i;
        this.f7974 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f7975;
        Object obj2 = this.f7974;
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
                ((AndFileFilter) obj2).addFileFilter((InterfaceC8911) obj);
                break;
            default:
                ((OrFileFilter) obj2).addFileFilter((InterfaceC8911) obj);
                break;
        }
    }
}
