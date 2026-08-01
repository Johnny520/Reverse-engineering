package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C1038;
import androidx.compose.p001ui.graphics.C2444;
import androidx.compose.runtime.internal.C2080;
import java.util.ArrayList;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.text.AbstractC5976;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonDecodingException;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p104.AbstractC7977;
import p104.AbstractC7988;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7992;
import p104.C8006;
import p104.InterfaceC8007;
import p105.C8011;
import p105.InterfaceC8013;
import p106.InterfaceC8016;
import p106.InterfaceC8018;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6330 extends AbstractC7176 implements InterfaceC8007 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C6342 f15542;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1038 f15543;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final WriteMode f15544;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C5317 f15545;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C8006 f15546;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2080 f15547;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f15548;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7988 f15549;

    public C6330(AbstractC7988 abstractC7988, WriteMode writeMode, C1038 c1038, InterfaceC8020 interfaceC8020, C5317 c5317) {
        writeMode.getClass();
        interfaceC8020.getClass();
        this.f15549 = abstractC7988;
        this.f15544 = writeMode;
        this.f15543 = c1038;
        this.f15547 = abstractC7988.f19472;
        this.f15548 = -1;
        this.f15545 = c5317;
        C8006 c8006 = abstractC7988.f19473;
        this.f15546 = c8006;
        this.f15542 = c8006.f19498 ? null : new C6342(interfaceC8020);
    }

    @Override // p104.InterfaceC8007
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final AbstractC7988 mo11215() {
        return this.f15549;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo11216(InterfaceC8013 interfaceC8013) {
        String message;
        String strMo12982;
        String string;
        AbstractC7988 abstractC7988 = this.f15549;
        C1038 c1038 = this.f15543;
        C2444 c2444 = (C2444) c1038.f1093;
        interfaceC8013.getClass();
        try {
        } catch (MissingFieldException e) {
            message = e.getMessage();
            message.getClass();
            if (!AbstractC5976.m10735(message, "at path", false)) {
            }
        }
        if (!(interfaceC8013 instanceof C8011)) {
            return interfaceC8013.deserialize(this);
        }
        String strM11312 = AbstractC6339.m11312(abstractC7988, ((C8011) interfaceC8013).getDescriptor());
        String strM1222 = c1038.m1222(strM11312, this.f15546.f19500);
        if (strM1222 != null) {
            int i = 2;
            try {
                InterfaceC8013 interfaceC8013M10604 = AbstractC5894.m10604((C8011) interfaceC8013, this, strM1222);
                C5317 c5317 = new C5317(i);
                c5317.f13458 = strM11312;
                this.f15545 = c5317;
                return interfaceC8013M10604.deserialize(this);
            } catch (SerializationException e2) {
                String message2 = e2.getMessage();
                message2.getClass();
                String strM10710 = AbstractC5976.m10710(AbstractC5976.m10716(message2, '\n'), ".");
                String message3 = e2.getMessage();
                message3.getClass();
                String strSubstring = "";
                int iM10730 = AbstractC5976.m10730(message3, '\n', 0, 6);
                if (iM10730 != -1) {
                    strSubstring = message3.substring(iM10730 + 1, message3.length());
                }
                C1038.m1212(c1038, strM10710, 0, strSubstring, 2);
                throw null;
            }
        }
        String strM113122 = AbstractC6339.m11312(abstractC7988, ((C8011) interfaceC8013).getDescriptor());
        AbstractC8005 abstractC8005Mo11240 = mo11240();
        String strMo12941 = ((C8011) interfaceC8013).getDescriptor().mo12941();
        if (abstractC8005Mo11240 instanceof C7981) {
            C7981 c7981 = (C7981) abstractC8005Mo11240;
            AbstractC8005 abstractC8005 = (AbstractC8005) c7981.get(strM113122);
            if (abstractC8005 != null) {
                AbstractC7977 abstractC7977M12987 = AbstractC7997.m12987(abstractC8005);
                strMo12982 = abstractC7977M12987 instanceof C7992 ? null : abstractC7977M12987.mo12982();
            }
            try {
                return AbstractC6339.m11309(abstractC7988, strM113122, c7981, AbstractC5894.m10604((C8011) interfaceC8013, this, strMo12982));
            } catch (SerializationException e3) {
                String message4 = e3.getMessage();
                message4.getClass();
                string = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, c7981.toString()).toString() : null;
                throw new JsonDecodingException(AbstractC6339.m11317(message4, null, null, -1, string), message4, -1, null, string, null);
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C5229 c5229 = AbstractC5228.f13320;
        sb.append(c5229.mo9476(C7981.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c5229.mo9476(abstractC8005Mo11240.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(strMo12941);
        String string2 = sb.toString();
        String strM3523 = c2444.m3523();
        string = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11240.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(string2, strM3523, null, -1, string), string2, -1, strM3523, string, null);
        message = e.getMessage();
        message.getClass();
        if (!AbstractC5976.m10735(message, "at path", false)) {
            throw e;
        }
        throw e.withNewMessageInternal$kotlinx_serialization_core(e.getMessage() + " at path: " + c2444.m3523());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo11217() {
        boolean z;
        C6342 c6342 = this.f15542;
        if (!(c6342 != null ? c6342.f15580 : false)) {
            C1038 c1038 = this.f15543;
            int iM1229 = c1038.m1229(c1038.m1220());
            String str = (String) c1038.f1097;
            int length = str.length() - iM1229;
            if (length < 4 || iM1229 == -1) {
                z = false;
                if (z) {
                    return true;
                }
            } else {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(iM1229 + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || AbstractC6339.m11298(str.charAt(iM1229 + 4)) != 0) {
                        c1038.f1095 = iM1229 + 4;
                        z = true;
                    }
                }
                z = false;
                if (z) {
                }
            }
        }
        return false;
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final String mo11221() {
        boolean z = this.f15546.f19500;
        C1038 c1038 = this.f15543;
        return z ? c1038.m1245() : c1038.m1253();
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo11224() {
        C1038 c1038 = this.f15543;
        long jM1255 = c1038.m1255();
        int i = (int) jM1255;
        if (jM1255 == i) {
            return i;
        }
        C1038.m1212(c1038, "Failed to parse int for input '" + jM1255 + '\'', 0, null, 6);
        throw null;
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo11227() {
        return this.f15543.m1255();
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final int mo11231(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        return AbstractC6339.m11315(interfaceC8020, this.f15549, mo11221(), " at path ".concat(((C2444) this.f15543.f1093).m3523()));
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo11233(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        C2444 c2444 = (C2444) this.f15543.f1093;
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        boolean z = this.f15544 == WriteMode.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) c2444.f5059;
            int i2 = c2444.f5062;
            if (iArr[i2] == -2) {
                ((Object[]) c2444.f5060)[i2] = C6340.f15576;
            }
        }
        Object objMo11216 = mo11216(interfaceC8013);
        if (z) {
            int[] iArr2 = (int[]) c2444.f5059;
            int i3 = c2444.f5062;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c2444.f5062 = i4;
                if (i4 == ((Object[]) c2444.f5060).length) {
                    c2444.m3520();
                }
            }
            Object[] objArr = (Object[]) c2444.f5060;
            int i5 = c2444.f5062;
            objArr[i5] = ((C8006) c2444.f5061).f19506 ? objMo11216 : C6340.f15577;
            ((int[]) c2444.f5059)[i5] = -2;
        }
        return objMo11216;
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8018 mo11235(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        AbstractC7988 abstractC7988 = this.f15549;
        WriteMode writeModeM11305 = AbstractC6339.m11305(abstractC7988, interfaceC8020);
        C1038 c1038 = this.f15543;
        C2444 c2444 = (C2444) c1038.f1093;
        c2444.getClass();
        int i = c2444.f5062 + 1;
        c2444.f5062 = i;
        if (i == ((Object[]) c2444.f5060).length) {
            c2444.m3520();
        }
        ((Object[]) c2444.f5060)[i] = interfaceC8020;
        c1038.m1254(writeModeM11305.begin);
        if (c1038.m1233() != 4) {
            int i2 = AbstractC6329.f15541[writeModeM11305.ordinal()];
            return (i2 == 1 || i2 == 2 || i2 == 3) ? new C6330(abstractC7988, writeModeM11305, c1038, interfaceC8020, this.f15545) : (this.f15544 == writeModeM11305 && abstractC7988.f19473.f19498) ? this : new C6330(abstractC7988, writeModeM11305, c1038, interfaceC8020, this.f15545);
        }
        C1038.m1212(c1038, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C2080 mo11236() {
        return this.f15547;
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        if (interfaceC8020.mo12939() == 0 && AbstractC6339.m11307(this.f15549, interfaceC8020)) {
            while (mo11277(interfaceC8020) != -1) {
            }
        }
        C1038 c1038 = this.f15543;
        if (c1038.m1217()) {
            AbstractC6339.m11306(c1038, "");
            throw null;
        }
        c1038.m1254(this.f15544.end);
        C2444 c2444 = (C2444) c1038.f1093;
        int i = c2444.f5062;
        int[] iArr = (int[]) c2444.f5059;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c2444.f5062 = i - 1;
        }
        int i2 = c2444.f5062;
        if (i2 != -1) {
            c2444.f5062 = i2 - 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        r0 = r3.f5062;
        r1 = (int[]) r3.f5059;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r1[r0] != (-2)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        r1[r0] = -1;
        r3.f5062 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        r0 = r3.f5062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        if (r0 == (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        r3.f5062 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r2.m1240(kotlin.text.AbstractC5976.m10728(0, 6, ((java.lang.String) r2.f1097).subSequence(0, r2.f1095).toString(), r4), p025.AbstractC7012.m12149('\'', "Encountered an unknown key '", r4), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        throw null;
     */
    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo11277(InterfaceC8020 interfaceC8020) throws NoSuchMethodException {
        C1038 c1038 = this.f15543;
        C2444 c2444 = (C2444) c1038.f1093;
        interfaceC8020.getClass();
        int[] iArr = AbstractC6329.f15541;
        WriteMode writeMode = this.f15544;
        int i = iArr[writeMode.ordinal()];
        char c = ':';
        boolean zM1217 = false;
        int iM12962 = -1;
        if (i == 2) {
            int i2 = this.f15548;
            boolean z = i2 % 2 != 0;
            if (!z) {
                c1038.m1254(':');
            } else if (i2 != -1) {
                zM1217 = c1038.m1217();
            }
            if (c1038.m1237()) {
                if (z) {
                    int i3 = this.f15548;
                    int i4 = c1038.f1095;
                    if (i3 == -1) {
                        if (zM1217) {
                            C1038.m1212(c1038, "Unexpected leading comma", i4, null, 4);
                            throw null;
                        }
                    } else if (!zM1217) {
                        C1038.m1212(c1038, "Expected comma after the key-value pair", i4, null, 4);
                        throw null;
                    }
                }
                iM12962 = this.f15548 + 1;
                this.f15548 = iM12962;
            } else if (zM1217) {
                AbstractC6339.m11306(c1038, "object");
                throw null;
            }
        } else if (i != 4) {
            boolean zM12172 = c1038.m1217();
            if (c1038.m1237()) {
                int i5 = this.f15548;
                if (i5 != -1 && !zM12172) {
                    C1038.m1212(c1038, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                iM12962 = i5 + 1;
                this.f15548 = iM12962;
            } else if (zM12172) {
                AbstractC6339.m11306(c1038, "array");
                throw null;
            }
        } else {
            boolean zM12173 = c1038.m1217();
            while (true) {
                boolean zM1237 = c1038.m1237();
                C6342 c6342 = this.f15542;
                if (zM1237) {
                    boolean z2 = this.f15546.f19500;
                    String strM1245 = z2 ? c1038.m1245() : c1038.m1234();
                    c1038.m1254(c);
                    AbstractC7988 abstractC7988 = this.f15549;
                    int iM11314 = AbstractC6339.m11314(interfaceC8020, abstractC7988, strM1245);
                    if (iM11314 != -3) {
                        if (c6342 != null) {
                            c6342.f15581.m12963(iM11314);
                        }
                        iM12962 = iM11314;
                    } else {
                        if (!AbstractC6339.m11307(abstractC7988, interfaceC8020)) {
                            C5317 c5317 = this.f15545;
                            if (c5317 == null || !AbstractC5227.m9466(c5317.f13458, strM1245)) {
                                break;
                            }
                            c5317.f13458 = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bM1233 = c1038.m1233();
                        if (bM1233 == 8 || bM1233 == 6) {
                            while (true) {
                                byte bM12332 = c1038.m1233();
                                if (bM12332 != 1) {
                                    if (bM12332 == 8 || bM12332 == 6) {
                                        arrayList.add(Byte.valueOf(bM12332));
                                    } else if (bM12332 == 9) {
                                        if (((Number) AbstractC5176.m9367(arrayList)).byteValue() != 8) {
                                            C1038.m1212(c1038, "found ] instead of }", 0, null, 6);
                                            throw null;
                                        }
                                        AbstractC5176.m9351(arrayList);
                                    } else if (bM12332 == 7) {
                                        if (((Number) AbstractC5176.m9367(arrayList)).byteValue() != 6) {
                                            C1038.m1212(c1038, "found } instead of ]", 0, null, 6);
                                            throw null;
                                        }
                                        AbstractC5176.m9351(arrayList);
                                    } else if (bM12332 == 10) {
                                        C1038.m1212(c1038, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    c1038.m1251();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z2) {
                                    c1038.m1246();
                                } else {
                                    c1038.m1234();
                                }
                            }
                        } else {
                            c1038.m1246();
                        }
                        zM12173 = c1038.m1217();
                        c = ':';
                    }
                } else {
                    if (zM12173) {
                        AbstractC6339.m11306(c1038, "object");
                        throw null;
                    }
                    if (c6342 != null) {
                        iM12962 = c6342.f15581.m12962();
                    }
                }
            }
        }
        if (writeMode != WriteMode.MAP) {
            ((int[]) c2444.f5059)[c2444.f5062] = iM12962;
        }
        return iM12962;
    }

    @Override // p104.InterfaceC8007
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC8005 mo11240() {
        return new C6326(this.f15549.f19473, this.f15543).m11263();
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC8016 mo11248(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        return AbstractC6318.m11202(interfaceC8020) ? new C6341(this.f15543, this.f15549) : this;
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final char mo11249() {
        C1038 c1038 = this.f15543;
        String strM1246 = c1038.m1246();
        if (strM1246.length() == 1) {
            return strM1246.charAt(0);
        }
        C1038.m1212(c1038, AbstractC7012.m12149('\'', "Expected single char, but got '", strM1246), 0, null, 6);
        throw null;
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo11250() {
        boolean z;
        boolean z2;
        C1038 c1038 = this.f15543;
        int iM1220 = c1038.m1220();
        String str = (String) c1038.f1097;
        if (iM1220 == str.length()) {
            C1038.m1212(c1038, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iM1220) == '\"') {
            iM1220++;
            z = true;
        } else {
            z = false;
        }
        int iM1229 = c1038.m1229(iM1220);
        if (iM1229 >= str.length() || iM1229 == -1) {
            C1038.m1212(c1038, "EOF", 0, null, 6);
            throw null;
        }
        int i = iM1229 + 1;
        int iCharAt = str.charAt(iM1229) | ' ';
        if (iCharAt == 102) {
            c1038.m1235(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                C1038.m1212(c1038, "Expected valid boolean literal prefix, but had '" + c1038.m1246() + '\'', 0, null, 6);
                throw null;
            }
            c1038.m1235(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (c1038.f1095 == str.length()) {
            C1038.m1212(c1038, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(c1038.f1095) == '\"') {
            c1038.f1095++;
            return z2;
        }
        C1038.m1212(c1038, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final double mo11255() {
        C1038 c1038 = this.f15543;
        String strM1246 = c1038.m1246();
        try {
            double d = Double.parseDouble(strM1246);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            C1038.m1212(c1038, AbstractC6339.m11308(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C1038.m1212(c1038, AbstractC7012.m12149('\'', "Failed to parse type 'double' for input '", strM1246), 0, null, 6);
            throw null;
        }
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final float mo11256() {
        C1038 c1038 = this.f15543;
        String strM1246 = c1038.m1246();
        try {
            float f = Float.parseFloat(strM1246);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            C1038.m1212(c1038, AbstractC6339.m11308(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C1038.m1212(c1038, AbstractC7012.m12149('\'', "Failed to parse type 'float' for input '", strM1246), 0, null, 6);
            throw null;
        }
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final short mo11257() {
        C1038 c1038 = this.f15543;
        long jM1255 = c1038.m1255();
        short s = (short) jM1255;
        if (jM1255 == s) {
            return s;
        }
        C1038.m1212(c1038, "Failed to parse short for input '" + jM1255 + '\'', 0, null, 6);
        throw null;
    }

    @Override // p050.AbstractC7176, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo11259() {
        C1038 c1038 = this.f15543;
        long jM1255 = c1038.m1255();
        byte b = (byte) jM1255;
        if (jM1255 == b) {
            return b;
        }
        C1038.m1212(c1038, "Failed to parse byte for input '" + jM1255 + '\'', 0, null, 6);
        throw null;
    }
}
