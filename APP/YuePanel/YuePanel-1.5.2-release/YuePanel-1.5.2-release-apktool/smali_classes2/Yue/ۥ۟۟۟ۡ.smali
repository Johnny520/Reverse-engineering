.class public final LYue/ۥ۟۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥ۟ۨۨۦ;
    message = "changed in Okio 2.x"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۟۟۟ۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟۟۟ۡ;

    invoke-direct {v0}, LYue/ۥ۟۟۟ۡ;-><init>()V

    sput-object v0, LYue/ۥ۟۟۟ۡ;->ۥ:LYue/ۥ۟۟۟ۡ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/lang/String;)J
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "string.utf8Size()"
            imports = {
                "okio.utf8Size"
            }
        .end subannotation
    .end annotation

    const-string v0, "string"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v2, v0, v1}, LYue/ۥۣۢۤۡ;->ۥ۟۟۟ۦ(Ljava/lang/String;IIILjava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۥ۟(Ljava/lang/String;II)J
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "moved to extension function"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "string.utf8Size(beginIndex, endIndex)"
            imports = {
                "okio.utf8Size"
            }
        .end subannotation
    .end annotation

    const-string v0, "string"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2, p3}, LYue/ۥۣۢۤۡ;->ۥ۟۟۟ۥ(Ljava/lang/String;II)J

    move-result-wide p1

    return-wide p1
.end method
