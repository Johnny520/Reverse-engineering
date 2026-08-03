.class public final LYue/ۥ۠ۡ۠ۤ$ۥ۟۟ۢۢ;
.super LYue/ۥ۠ۡ۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡ۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06e2\u06e2"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۡ۠ۤ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟ۢۢ;->ۥ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟ۢۢ;->ۥ:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z
    .locals 0

    invoke-virtual {p2}, LYue/ۥ۠۠ۥۥ;->ۥۣ۟۟۠()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, LYue/ۥ۠ۡ۠ۤ$ۥ۟۟ۢۢ;->ۥ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
