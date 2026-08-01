package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.appcompat.app.C0960;
import p122.AbstractC8137;
import p122.AbstractC8140;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1782 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f3034;

    public /* synthetic */ C1782(int i) {
        this.f3034 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final KeyCommand m2429(KeyEvent keyEvent) {
        KeyCommand keyCommand;
        KeyCommand keyCommand2;
        KeyCommand keyCommand3 = null;
        switch (this.f3034) {
            case 0:
                int iM2459 = AbstractC1821.m2459(keyEvent);
                if (iM2459 == 10) {
                    if (AbstractC8140.m13065(AbstractC8137.m13064(keyEvent.getKeyCode()), AbstractC8140.f19832)) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (iM2459 == 2) {
                    long jM13064 = AbstractC8137.m13064(keyEvent.getKeyCode());
                    if (AbstractC8140.m13065(jM13064, AbstractC8140.f19839) || AbstractC8140.m13065(jM13064, AbstractC8140.f19825) || AbstractC8140.m13065(jM13064, AbstractC8140.f19802)) {
                        return KeyCommand.COPY;
                    }
                    if (AbstractC8140.m13065(jM13064, AbstractC8140.f19837)) {
                        return KeyCommand.PASTE;
                    }
                    if (AbstractC8140.m13065(jM13064, AbstractC8140.f19829)) {
                        return KeyCommand.CUT;
                    }
                    if (AbstractC8140.m13065(jM13064, AbstractC8140.f19838)) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (AbstractC8140.m13065(jM13064, AbstractC8140.f19828)) {
                        return KeyCommand.REDO;
                    }
                    if (AbstractC8140.m13065(jM13064, AbstractC8140.f19832)) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (iM2459 == 8) {
                    long jM130642 = AbstractC8137.m13064(keyEvent.getKeyCode());
                    if (AbstractC8140.m13065(jM130642, AbstractC8140.f19816) || AbstractC8140.m13065(jM130642, AbstractC8140.f19812)) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (AbstractC8140.m13065(jM130642, AbstractC8140.f19835) || AbstractC8140.m13065(jM130642, AbstractC8140.f19811)) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (AbstractC8140.m13065(jM130642, AbstractC8140.f19818) || AbstractC8140.m13065(jM130642, AbstractC8140.f19814)) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (AbstractC8140.m13065(jM130642, AbstractC8140.f19817) || AbstractC8140.m13065(jM130642, AbstractC8140.f19813)) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (AbstractC8140.m13065(jM130642, AbstractC8140.f19805) || AbstractC8140.m13065(jM130642, AbstractC8140.f19800)) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (AbstractC8140.m13065(jM130642, AbstractC8140.f19804) || AbstractC8140.m13065(jM130642, AbstractC8140.f19803)) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (AbstractC8140.m13065(jM130642, AbstractC8140.f19827) || AbstractC8140.m13065(jM130642, AbstractC8140.f19810)) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (AbstractC8140.m13065(jM130642, AbstractC8140.f19824) || AbstractC8140.m13065(jM130642, AbstractC8140.f19801)) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (AbstractC8140.m13065(jM130642, AbstractC8140.f19825) || AbstractC8140.m13065(jM130642, AbstractC8140.f19802)) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                if (iM2459 != 0) {
                    return null;
                }
                long jM130643 = AbstractC8137.m13064(keyEvent.getKeyCode());
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19816) || AbstractC8140.m13065(jM130643, AbstractC8140.f19812)) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19835) || AbstractC8140.m13065(jM130643, AbstractC8140.f19811)) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19818) || AbstractC8140.m13065(jM130643, AbstractC8140.f19814)) {
                    return KeyCommand.f8UP;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19817) || AbstractC8140.m13065(jM130643, AbstractC8140.f19813)) {
                    return KeyCommand.DOWN;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19834)) {
                    return KeyCommand.CENTER;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19805) || AbstractC8140.m13065(jM130643, AbstractC8140.f19800)) {
                    return KeyCommand.PAGE_UP;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19804) || AbstractC8140.m13065(jM130643, AbstractC8140.f19803)) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19827) || AbstractC8140.m13065(jM130643, AbstractC8140.f19810)) {
                    return KeyCommand.LINE_START;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19824) || AbstractC8140.m13065(jM130643, AbstractC8140.f19801)) {
                    return KeyCommand.LINE_END;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19831) || AbstractC8140.m13065(jM130643, AbstractC8140.f19815)) {
                    return KeyCommand.NEW_LINE;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19823)) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19822)) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19807)) {
                    return KeyCommand.PASTE;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19809)) {
                    return KeyCommand.CUT;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19808)) {
                    return KeyCommand.COPY;
                }
                if (AbstractC8140.m13065(jM130643, AbstractC8140.f19833)) {
                    return KeyCommand.TAB;
                }
                return null;
            default:
                int iM24592 = AbstractC1821.m2459(keyEvent);
                int i = AbstractC1821.f3195;
                if (iM24592 == 9) {
                    long jM130644 = AbstractC8137.m13064(keyEvent.getKeyCode());
                    keyCommand = AbstractC8140.m13065(jM130644, AbstractC8140.f19816) ? KeyCommand.SELECT_LINE_LEFT : AbstractC8140.m13065(jM130644, AbstractC8140.f19835) ? KeyCommand.SELECT_LINE_RIGHT : AbstractC8140.m13065(jM130644, AbstractC8140.f19818) ? KeyCommand.SELECT_HOME : AbstractC8140.m13065(jM130644, AbstractC8140.f19817) ? KeyCommand.SELECT_END : null;
                } else if (iM24592 == 1) {
                    long jM130645 = AbstractC8137.m13064(keyEvent.getKeyCode());
                    if (AbstractC8140.m13065(jM130645, AbstractC8140.f19816)) {
                        keyCommand = KeyCommand.LINE_LEFT;
                    } else if (AbstractC8140.m13065(jM130645, AbstractC8140.f19835)) {
                        keyCommand = KeyCommand.LINE_RIGHT;
                    } else if (AbstractC8140.m13065(jM130645, AbstractC8140.f19818)) {
                        keyCommand = KeyCommand.HOME;
                    } else if (AbstractC8140.m13065(jM130645, AbstractC8140.f19817)) {
                        keyCommand = KeyCommand.END;
                    } else if (AbstractC8140.m13065(jM130645, AbstractC8140.f19823)) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    }
                }
                if (keyCommand != null) {
                    return keyCommand;
                }
                C0960 c0960 = AbstractC1821.f3199;
                int i2 = AbstractC1821.f3202;
                int iM24593 = AbstractC1821.m2459(keyEvent);
                long jM130646 = AbstractC8137.m13064(keyEvent.getKeyCode());
                if (AbstractC8140.m13065(jM130646, AbstractC8140.f19823)) {
                    if (iM24593 != 0 && iM24593 != 8) {
                        int i3 = AbstractC1821.f3201;
                        keyCommand2 = iM24593 == 12 ? KeyCommand.DELETE_PREV_CHAR : (iM24593 == 2 || iM24593 == 10) ? KeyCommand.DELETE_PREV_WORD : null;
                    }
                } else if ((AbstractC8140.m13065(jM130646, AbstractC8140.f19831) || AbstractC8140.m13065(jM130646, AbstractC8140.f19815)) && (iM24593 == 0 || iM24593 == 8 || iM24593 == 2 || iM24593 == 10)) {
                    keyCommand2 = KeyCommand.NEW_LINE;
                }
                if (keyCommand2 != null) {
                    return keyCommand2;
                }
                int iM24594 = AbstractC1821.m2459(keyEvent);
                if (iM24594 == 10) {
                    long jM130647 = AbstractC8137.m13064(keyEvent.getKeyCode());
                    if (AbstractC8140.m13065(jM130647, AbstractC8140.f19816) || AbstractC8140.m13065(jM130647, AbstractC8140.f19812)) {
                        keyCommand3 = KeyCommand.SELECT_LEFT_WORD;
                    } else if (AbstractC8140.m13065(jM130647, AbstractC8140.f19835) || AbstractC8140.m13065(jM130647, AbstractC8140.f19811)) {
                        keyCommand3 = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (AbstractC8140.m13065(jM130647, AbstractC8140.f19818) || AbstractC8140.m13065(jM130647, AbstractC8140.f19814)) {
                        keyCommand3 = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (AbstractC8140.m13065(jM130647, AbstractC8140.f19817) || AbstractC8140.m13065(jM130647, AbstractC8140.f19813)) {
                        keyCommand3 = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (iM24594 == 2) {
                    long jM130648 = AbstractC8137.m13064(keyEvent.getKeyCode());
                    if (AbstractC8140.m13065(jM130648, AbstractC8140.f19816) || AbstractC8140.m13065(jM130648, AbstractC8140.f19812)) {
                        keyCommand3 = KeyCommand.LEFT_WORD;
                    } else if (AbstractC8140.m13065(jM130648, AbstractC8140.f19835) || AbstractC8140.m13065(jM130648, AbstractC8140.f19811)) {
                        keyCommand3 = KeyCommand.RIGHT_WORD;
                    } else if (AbstractC8140.m13065(jM130648, AbstractC8140.f19818) || AbstractC8140.m13065(jM130648, AbstractC8140.f19814)) {
                        keyCommand3 = KeyCommand.PREV_PARAGRAPH;
                    } else if (AbstractC8140.m13065(jM130648, AbstractC8140.f19817) || AbstractC8140.m13065(jM130648, AbstractC8140.f19813)) {
                        keyCommand3 = KeyCommand.NEXT_PARAGRAPH;
                    } else if (AbstractC8140.m13065(jM130648, AbstractC8140.f19836)) {
                        keyCommand3 = KeyCommand.DELETE_PREV_CHAR;
                    } else if (AbstractC8140.m13065(jM130648, AbstractC8140.f19822)) {
                        keyCommand3 = KeyCommand.DELETE_NEXT_WORD;
                    } else if (AbstractC8140.m13065(jM130648, AbstractC8140.f19806)) {
                        keyCommand3 = KeyCommand.DESELECT;
                    }
                } else if (iM24594 == 8) {
                    long jM130649 = AbstractC8137.m13064(keyEvent.getKeyCode());
                    if (AbstractC8140.m13065(jM130649, AbstractC8140.f19827) || AbstractC8140.m13065(jM130649, AbstractC8140.f19810)) {
                        keyCommand3 = KeyCommand.SELECT_LINE_START;
                    } else if (AbstractC8140.m13065(jM130649, AbstractC8140.f19824) || AbstractC8140.m13065(jM130649, AbstractC8140.f19801)) {
                        keyCommand3 = KeyCommand.SELECT_LINE_END;
                    }
                } else if (iM24594 == 1 && AbstractC8140.m13065(AbstractC8137.m13064(keyEvent.getKeyCode()), AbstractC8140.f19822)) {
                    keyCommand3 = KeyCommand.DELETE_TO_LINE_END;
                }
                return keyCommand3 == null ? ((C1782) c0960.f702).m2429(keyEvent) : keyCommand3;
        }
    }
}
