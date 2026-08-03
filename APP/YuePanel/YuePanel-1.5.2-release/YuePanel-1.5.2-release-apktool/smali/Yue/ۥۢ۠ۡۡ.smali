.class public final LYue/ۥۢ۠ۡۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0}, Landroid/text/TextUtils;->htmlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
