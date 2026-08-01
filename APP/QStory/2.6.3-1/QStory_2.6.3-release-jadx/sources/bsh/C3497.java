package bsh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import org.apache.commons.lang3.CharSet;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.p014io.filefilter.AndFileFilter;
import org.apache.commons.p014io.filefilter.OrFileFilter;
import p375.InterfaceC9740;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3497 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f8319;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8320;

    public /* synthetic */ C3497(Object obj, int i) {
        this.f8320 = i;
        this.f8319 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f8320;
        Object obj2 = this.f8319;
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
                ((AndFileFilter) obj2).addFileFilter((InterfaceC9740) obj);
                break;
            default:
                ((OrFileFilter) obj2).addFileFilter((InterfaceC9740) obj);
                break;
        }
    }
}
