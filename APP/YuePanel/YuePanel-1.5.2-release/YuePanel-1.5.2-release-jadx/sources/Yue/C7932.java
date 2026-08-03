package Yue;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.util.Enumeration;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: renamed from: Yue.ۥۢۡۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7932 {
    /* JADX INFO: renamed from: ۥ */
    public static void m3948(C4273 c4273) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c4273.f777);
        stringBuffer.append(" ");
        printStream.print(stringBuffer.toString());
        Object obj = c4273.f778;
        if (obj instanceof String) {
            printStream.print(obj);
        } else {
            int i = 0;
            if (obj instanceof C4282) {
                printStream.print("(");
                String[] strArrM12368 = ((C4282) c4273.f778).m12368();
                while (i < strArrM12368.length) {
                    if (i > 0) {
                        System.out.print(",");
                    }
                    System.out.print(strArrM12368[i]);
                    i++;
                }
                System.out.print(")");
            } else if (obj instanceof C4289) {
                printStream.print("Notation (");
                String[] strArrM12388 = ((C4289) c4273.f778).m12388();
                while (i < strArrM12388.length) {
                    if (i > 0) {
                        System.out.print(",");
                    }
                    System.out.print(strArrM12388[i]);
                    i++;
                }
                System.out.print(")");
            }
        }
        if (c4273.f8796 != null) {
            PrintStream printStream2 = System.out;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(" ");
            stringBuffer2.append(c4273.f8796.f784);
            printStream2.print(stringBuffer2.toString());
        }
        if (c4273.f8797 != null) {
            PrintStream printStream3 = System.out;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(" ");
            stringBuffer3.append(c4273.f8797);
            printStream3.print(stringBuffer3.toString());
        }
        System.out.println();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3949(AbstractC4285 abstractC4285) {
        if (abstractC4285 == null) {
            return;
        }
        if (abstractC4285 instanceof C4271) {
            System.out.print("Any");
        } else if (abstractC4285 instanceof C4280) {
            System.out.print("Empty");
        } else if (abstractC4285 instanceof C4287) {
            System.out.print(((C4287) abstractC4285).f792);
        } else {
            int i = 0;
            if (abstractC4285 instanceof C4275) {
                System.out.print("(");
                AbstractC4285[] abstractC4285ArrM12344 = ((C4275) abstractC4285).m12344();
                while (i < abstractC4285ArrM12344.length) {
                    if (i > 0) {
                        System.out.print("|");
                    }
                    m3949(abstractC4285ArrM12344[i]);
                    i++;
                }
                System.out.print(")");
            } else if (abstractC4285 instanceof C4296) {
                System.out.print("(");
                AbstractC4285[] abstractC4285ArrM123442 = ((C4296) abstractC4285).m12344();
                while (i < abstractC4285ArrM123442.length) {
                    if (i > 0) {
                        System.out.print(",");
                    }
                    m3949(abstractC4285ArrM123442[i]);
                    i++;
                }
                System.out.print(")");
            } else if (abstractC4285 instanceof C4286) {
                System.out.print("(");
                AbstractC4285[] abstractC4285ArrM123443 = ((C4286) abstractC4285).m12344();
                while (i < abstractC4285ArrM123443.length) {
                    if (i > 0) {
                        System.out.print(",");
                    }
                    m3949(abstractC4285ArrM123443[i]);
                    i++;
                }
                System.out.print(")");
            } else if (abstractC4285 instanceof C4291) {
                System.out.print("#PCDATA");
            }
        }
        C4274 c4274 = abstractC4285.f791;
        if (c4274 == C4274.f8799) {
            System.out.print(TypeDescription.Generic.OfWildcardType.SYMBOL);
        } else if (c4274 == C4274.f8800) {
            System.out.print(InterfaceC5949.f14892);
        } else if (c4274 == C4274.f8801) {
            System.out.print(InterfaceC5949.f14893);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m25040(String[] strArr) {
        try {
            C4270 c4270M12395 = (strArr[0].indexOf("://") > 0 ? new C4293(new URL(strArr[0]), true) : new C4293(new File(strArr[0]), true)).m12395(true);
            if (c4270M12395.f8795 != null) {
                PrintStream printStream = System.out;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Root element is probably: ");
                stringBuffer.append(c4270M12395.f8795.f785);
                printStream.println(stringBuffer.toString());
            }
            Enumeration enumerationElements = c4270M12395.f773.elements();
            while (enumerationElements.hasMoreElements()) {
                C4279 c4279 = (C4279) enumerationElements.nextElement();
                PrintStream printStream2 = System.out;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Element: ");
                stringBuffer2.append(c4279.f785);
                printStream2.println(stringBuffer2.toString());
                printStream2.print("   Content: ");
                m3949(c4279.f8806);
                printStream2.println();
                if (c4279.f786.size() > 0) {
                    printStream2.println("   Attributes: ");
                    Enumeration enumerationElements2 = c4279.f786.elements();
                    while (enumerationElements2.hasMoreElements()) {
                        System.out.print("        ");
                        m3948((C4273) enumerationElements2.nextElement());
                    }
                    System.out.println();
                }
            }
            Enumeration enumerationElements3 = c4270M12395.f774.elements();
            while (enumerationElements3.hasMoreElements()) {
                C4281 c4281 = (C4281) enumerationElements3.nextElement();
                if (c4281.f788) {
                    System.out.print("Parsed ");
                }
                PrintStream printStream3 = System.out;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Entity: ");
                stringBuffer3.append(c4281.f787);
                printStream3.println(stringBuffer3.toString());
                if (c4281.f8807 != null) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("    Value: ");
                    stringBuffer4.append(c4281.f8807);
                    printStream3.println(stringBuffer4.toString());
                }
                AbstractC4284 abstractC4284 = c4281.f8808;
                if (abstractC4284 != null) {
                    if (abstractC4284 instanceof C4297) {
                        StringBuffer stringBuffer5 = new StringBuffer();
                        stringBuffer5.append("    System: ");
                        stringBuffer5.append(c4281.f8808.f790);
                        printStream3.println(stringBuffer5.toString());
                    } else {
                        C4295 c4295 = (C4295) abstractC4284;
                        StringBuffer stringBuffer6 = new StringBuffer();
                        stringBuffer6.append("    Public: ");
                        stringBuffer6.append(c4295.f799);
                        stringBuffer6.append(" ");
                        stringBuffer6.append(c4295.f790);
                        printStream3.println(stringBuffer6.toString());
                    }
                }
                if (c4281.f8809 != null) {
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append("    NDATA ");
                    stringBuffer7.append(c4281.f8809);
                    printStream3.println(stringBuffer7.toString());
                }
            }
            Enumeration enumerationElements4 = c4270M12395.f8792.elements();
            while (enumerationElements4.hasMoreElements()) {
                C4288 c4288 = (C4288) enumerationElements4.nextElement();
                PrintStream printStream4 = System.out;
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append("Notation: ");
                stringBuffer8.append(c4288.f793);
                printStream4.println(stringBuffer8.toString());
                AbstractC4284 abstractC42842 = c4288.f794;
                if (abstractC42842 != null) {
                    if (abstractC42842 instanceof C4297) {
                        StringBuffer stringBuffer9 = new StringBuffer();
                        stringBuffer9.append("    System: ");
                        stringBuffer9.append(c4288.f794.f790);
                        printStream4.println(stringBuffer9.toString());
                    } else {
                        C4295 c42952 = (C4295) abstractC42842;
                        StringBuffer stringBuffer10 = new StringBuffer();
                        stringBuffer10.append("    Public: ");
                        stringBuffer10.append(c42952.f799);
                        stringBuffer10.append(" ");
                        printStream4.print(stringBuffer10.toString());
                        String str = c42952.f790;
                        if (str != null) {
                            printStream4.println(str);
                        } else {
                            printStream4.println();
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
