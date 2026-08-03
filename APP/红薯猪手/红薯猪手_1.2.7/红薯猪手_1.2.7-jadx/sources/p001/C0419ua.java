package p001;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ۟.ua */
/* JADX INFO: loaded from: classes.dex */
public final class C0419ua extends AbstractC0335o4 implements InterfaceC0236h3<CharSequence, Integer, C0364q7<? extends Integer, ? extends Integer>> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ List<String> f1142;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ boolean f1143;

    public C0419ua(List<String> list, boolean z) {
        this.f1142 = list;
        this.f1143 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r15v13, resolved type: B */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da A[EDGE_INSN: B:61:0x00da->B:56:0x00da BREAK  A[LOOP:0: B:27:0x006a->B:38:0x009d], EDGE_INSN: B:67:0x00da->B:56:0x00da BREAK  A[LOOP:2: B:44:0x00ab->B:55:0x00d8]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da A[EDGE_INSN: B:61:0x00da->B:56:0x00da BREAK  A[LOOP:0: B:27:0x006a->B:38:0x009d]] */
    @Override // p001.InterfaceC0236h3
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0364q7<? extends Integer, ? extends Integer> mo863(CharSequence charSequence, Integer num) {
        Object next;
        C0364q7 c0364q7;
        Object next2;
        CharSequence charSequence2 = charSequence;
        int iIntValue = num.intValue();
        C0237h4.m1090("$this$$receiver", charSequence2);
        List<String> list = this.f1142;
        boolean z = this.f1143;
        if (z || list.size() != 1) {
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            C0223g4 c0223g4 = new C0223g4(iIntValue, charSequence2.length());
            if (charSequence2 instanceof String) {
                int i = c0223g4.f762;
                int i2 = c0223g4.f1424;
                if ((i2 <= 0 || iIntValue > i) && (i2 >= 0 || i > iIntValue)) {
                    c0364q7 = null;
                } else {
                    while (true) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                            String str = (String) next2;
                            if (C0406ta.m1246(str, 0, (String) charSequence2, iIntValue, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) next2;
                        if (str2 == null) {
                            if (iIntValue == i) {
                                break;
                            }
                            iIntValue += i2;
                        } else {
                            c0364q7 = new C0364q7(Integer.valueOf(iIntValue), str2);
                            break;
                        }
                    }
                    c0364q7 = null;
                }
            } else {
                int i3 = c0223g4.f762;
                int i4 = c0223g4.f1424;
                if ((i4 > 0 && iIntValue <= i3) || (i4 < 0 && i3 <= iIntValue)) {
                    while (true) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            String str3 = (String) next;
                            if (C0432va.m1257(str3, charSequence2, iIntValue, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) next;
                        if (str4 == null) {
                            if (iIntValue == i3) {
                                break;
                            }
                            iIntValue += i4;
                        } else {
                            c0364q7 = new C0364q7(Integer.valueOf(iIntValue), str4);
                            break;
                        }
                    }
                    c0364q7 = null;
                }
            }
        } else {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str5 = list.get(0);
            int iM1256 = C0432va.m1256(charSequence2, str5, iIntValue, false, 4);
            if (iM1256 >= 0) {
                c0364q7 = new C0364q7(Integer.valueOf(iM1256), str5);
            }
        }
        if (c0364q7 != null) {
            return new C0364q7<>(c0364q7.f1045, Integer.valueOf(((String) c0364q7.f1046).length()));
        }
        return null;
    }
}
