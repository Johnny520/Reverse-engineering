.class public LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:Ljava/lang/String;

.field public ۥ۟۟:LYue/ۥۡۦۣۨ;

.field public ۥ۟۟۟:Landroid/app/PendingIntent;

.field public ۥ۟۟۟۟:Landroid/app/PendingIntent;

.field public ۥ۟۟۟۠:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ:Ljava/util/List;

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/String;)LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public ۥ۟()LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;
    .locals 9
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [Ljava/lang/String;

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ۟:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v6

    new-instance v0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;

    iget-object v3, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ۟۟:LYue/ۥۡۦۣۨ;

    iget-object v4, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ۟۟۟۟:Landroid/app/PendingIntent;

    iget-object v5, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ۟۟۟:Landroid/app/PendingIntent;

    iget-wide v7, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ۟۟۟۠:J

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;-><init>([Ljava/lang/String;LYue/ۥۡۦۣۨ;Landroid/app/PendingIntent;Landroid/app/PendingIntent;[Ljava/lang/String;J)V

    return-object v0
.end method

.method public ۥ۟۟(J)LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-wide p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ۟۟۟۠:J

    return-object p0
.end method

.method public ۥ۟۟۟(Landroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;
    .locals 0
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ۟۟۟:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public ۥ۟۟۟۟(Landroid/app/PendingIntent;LYue/ۥۡۦۣۨ;)LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;
    .locals 0
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۦۣۨ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ۟۟:LYue/ۥۡۦۣۨ;

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟$ۥ;->ۥ۟۟۟۟:Landroid/app/PendingIntent;

    return-object p0
.end method
