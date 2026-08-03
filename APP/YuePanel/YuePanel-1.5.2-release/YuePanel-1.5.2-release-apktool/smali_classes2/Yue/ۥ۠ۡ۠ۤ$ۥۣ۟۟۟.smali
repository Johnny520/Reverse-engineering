.class public final LYue/ۥ۠ۡ۠ۤ$ۥۣ۟۟۟;
.super LYue/ۥ۠ۡ۠ۤ$ۥ۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟;->ۥ:Ljava/lang/String;

    iget-object v1, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "[%s!=%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z
    .locals 1

    iget-object p1, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    iget-object v0, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟;->ۥ:Ljava/lang/String;

    invoke-virtual {p2, v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟۟ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
