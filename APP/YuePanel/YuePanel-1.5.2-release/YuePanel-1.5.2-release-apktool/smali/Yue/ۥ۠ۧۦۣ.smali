.class public final LYue/ۥ۠ۧۦۣ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(Ljava/util/Locale;)I
    .locals 0
    .param p0    # Ljava/util/Locale;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-static {p0}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result p0

    return p0
.end method
