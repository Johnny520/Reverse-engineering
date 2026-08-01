package androidx.compose.runtime.tooling;

import com.android.p002dx.p003cf.attrib.AttSourceFile;
import com.android.p002dx.p005io.Opcodes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C5160;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p050.AbstractC7176;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JB\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0007\"\u0006\b\u0001\u0010\b\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m151d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;", "trace", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;)V", "T", "R", "", "Lkotlin/Function1;", "map", "", "mapToArray", "(Ljava/util/List;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)[Ljava/lang/Object;", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "Landroidx/compose/runtime/tooling/飘花落叶言子楪世苏哲兰;", "", "getMessage", "()Ljava/lang/String;", "message", "runtime"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class DiagnosticComposeException extends RuntimeException {
    public static final int $stable = 8;
    private final C2131 trace;

    public DiagnosticComposeException(C2131 c2131) {
        this.trace = c2131;
        if (c2131.f4129) {
            return;
        }
        int[] iArr = {201, Opcodes.REM_FLOAT_2ADDR, Opcodes.SUB_DOUBLE_2ADDR, Opcodes.DIV_DOUBLE_2ADDR, Opcodes.REM_DOUBLE_2ADDR, 125, -127, 126665345, 200};
        List list = c2131.f4130;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C2129 c2129 = (C2129) list.get(i);
            int i3 = c2129.f4127;
            int i4 = 0;
            while (true) {
                if (i4 >= 9) {
                    i4 = -1;
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                if (c2129.f4127 == 100) {
                    int i5 = i + 2;
                    if (i5 < size && ((C2129) list.get(i5)).f4127 == 1000) {
                        break;
                    } else if (!arrayList.isEmpty()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                } else {
                    arrayList.add(c2129);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            stackTraceElementArr[i6] = new StackTraceElement("$$compose", "m$" + ((C2129) arrayList.get(i6)).f4127, AttSourceFile.ATTRIBUTE_NAME, 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    private final <T, R> R[] mapToArray(List<? extends T> list, InterfaceC7387 interfaceC7387) {
        list.size();
        AbstractC5227.m9468();
        throw null;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (!this.trace.f4129) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        C2131 c2131 = this.trace;
        ListBuilder listBuilderM12470 = AbstractC7176.m12470();
        List list = c2131.f4130;
        list.getClass();
        C5160 c5160 = new C5160(list);
        int size = c5160.size();
        for (int i = 0; i < size; i++) {
            ((C2129) c5160.get(i)).getClass();
        }
        List listBuild = listBuilderM12470.build();
        listBuild.getClass();
        C5160 c51602 = new C5160(listBuild);
        int size2 = c51602.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) c51602.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
