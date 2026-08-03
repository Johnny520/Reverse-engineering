package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ze {

    public static class a {
        public static int a(android.widget.TextView r0) {
                int r0 = r0.getBreakStrategy()
                return r0
        }

        public static android.content.res.ColorStateList b(android.widget.TextView r0) {
                android.content.res.ColorStateList r0 = r0.getCompoundDrawableTintList()
                return r0
        }

        public static android.graphics.PorterDuff.Mode c(android.widget.TextView r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getCompoundDrawableTintMode()
                return r0
        }

        public static int d(android.widget.TextView r0) {
                int r0 = r0.getHyphenationFrequency()
                return r0
        }

        public static void e(android.widget.TextView r0, int r1) {
                r0.setBreakStrategy(r1)
                return
        }

        public static void f(android.widget.TextView r0, android.content.res.ColorStateList r1) {
                r0.setCompoundDrawableTintList(r1)
                return
        }

        public static void g(android.widget.TextView r0, android.graphics.PorterDuff.Mode r1) {
                r0.setCompoundDrawableTintMode(r1)
                return
        }

        public static void h(android.widget.TextView r0, int r1) {
                r0.setHyphenationFrequency(r1)
                return
        }
    }

    public static class b {
        public static java.lang.CharSequence a(android.text.PrecomputedText r0) {
                return r0
        }

        public static java.lang.String[] b(android.icu.text.DecimalFormatSymbols r0) {
                java.lang.String[] r0 = r0.getDigitStrings()
                return r0
        }

        public static android.text.PrecomputedText.Params c(android.widget.TextView r0) {
                android.text.PrecomputedText$Params r0 = r0.getTextMetricsParams()
                return r0
        }

        public static void d(android.widget.TextView r0, int r1) {
                r0.setFirstBaselineToTopHeight(r1)
                return
        }
    }

    public static class c {
        public static void a(android.widget.TextView r0, int r1, float r2) {
                r0.setLineHeight(r1, r2)
                return
        }
    }

    public static class d implements android.view.ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(android.view.ActionMode r1, android.view.MenuItem r2) {
                r0 = this;
                r1 = 0
                throw r1
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(android.view.ActionMode r1, android.view.Menu r2) {
                r0 = this;
                r1 = 0
                throw r1
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(android.view.ActionMode r1) {
                r0 = this;
                r1 = 0
                throw r1
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(android.view.ActionMode r1, android.view.Menu r2) {
                r0 = this;
                r1 = 0
                throw r1
        }
    }

    public static void a(android.widget.TextView r2, int r3) {
            a.C0282n9.g(r3)
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r3 == r0) goto L15
            int r3 = r3 - r0
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r0)
        L15:
            return
    }

    public static android.view.ActionMode.Callback b(android.view.ActionMode.Callback r1) {
            boolean r0 = r1 instanceof a.Ze.d
            if (r0 != 0) goto L5
            return r1
        L5:
            a.Ze$d r1 = (a.Ze.d) r1
            r1 = 0
            throw r1
    }
}
