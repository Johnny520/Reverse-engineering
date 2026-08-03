.class public LYue/ۥۢ۠ۢ;
.super LYue/ۥۢ۠ۡۨ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢ۠ۡۨ;-><init>()V

    return-void
.end method

.method public static final ۥ۟۟۠ۢ(Ljava/util/regex/Pattern;)LYue/ۥۡۦۣۢ;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۦۣۢ;

    invoke-direct {v0, p0}, LYue/ۥۡۦۣۢ;-><init>(Ljava/util/regex/Pattern;)V

    return-object v0
.end method
