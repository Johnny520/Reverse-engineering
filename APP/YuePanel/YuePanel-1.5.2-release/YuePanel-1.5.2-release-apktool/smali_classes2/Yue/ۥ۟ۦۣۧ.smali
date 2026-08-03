.class public final LYue/ۥ۟ۦۣۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۥۦۤ;


# static fields
.field public static final ۥ۟:LYue/ۥ۟ۦۣۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟ۦۣۧ;

    invoke-direct {v0}, LYue/ۥ۟ۦۣۧ;-><init>()V

    sput-object v0, LYue/ۥ۟ۦۣۧ;->ۥ۟:LYue/ۥ۟ۦۣۧ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥ۠ۥۦۤ$ۥ;)LYue/ۥۡۦۧ;
    .locals 10
    .param p1    # LYue/ۥ۠ۥۦۤ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "chain"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LYue/ۥۡۦ۠ۧ;

    invoke-virtual {p1}, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۦ()LYue/ۥۡۦ۠ۤ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥۡۦ۠ۤ;->ۥ۟۟۠ۥ(LYue/ۥۡۦ۠ۧ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v3

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۟ۥ(LYue/ۥۡۦ۠ۧ;ILYue/ۥۣ۠ۡ۟;LYue/ۥۡۦۤۧ;IIIILjava/lang/Object;)LYue/ۥۡۦ۠ۧ;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۠۟()LYue/ۥۡۦۤۧ;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۡۦ۠ۧ;->ۥۣ۟۟۟(LYue/ۥۡۦۤۧ;)LYue/ۥۡۦۧ;

    move-result-object p1

    return-object p1
.end method
