.class public LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۨۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e6"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;

.field public final ۥ۟:LYue/ۥ۠ۧۨ۠;


# direct methods
.method public constructor <init>(Ljava/lang/String;LYue/ۥ۠ۧۨ۠;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "invalid null provider"

    invoke-static {p1, v0}, LYue/ۥۡۢۨ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ:Ljava/lang/String;

    const-string p1, "invalid null listener"

    invoke-static {p2, p1}, LYue/ۥۡۢۨ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۧۨ۠;

    iput-object p1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۠ۧۨ۠;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ:Ljava/lang/String;

    iget-object v2, p1, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۠ۧۨ۠;

    iget-object p1, p1, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۠ۧۨ۠;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ:Ljava/lang/String;

    iget-object v1, p0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۦ;->ۥ۟:LYue/ۥ۠ۧۨ۠;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۢۨ;->ۥ۟([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
