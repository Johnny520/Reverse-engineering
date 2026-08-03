.class public abstract LYue/ۥ۠ۤۧۦ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۧۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۤۧۦ$ۥ۟۟$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۠ۤۧۦ$ۥ۟۟$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:LYue/ۥ۠ۤۧۦ$ۥ۟۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۠ۤۧۦ$ۥ۟۟$ۥ۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۤۧۦ$ۥ۟۟$ۥ۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۤۧۦ$ۥ۟۟;->ۥ:LYue/ۥ۠ۤۧۦ$ۥ۟۟$ۥ۟;

    new-instance v0, LYue/ۥ۠ۤۧۦ$ۥ۟۟$ۥ;

    invoke-direct {v0}, LYue/ۥ۠ۤۧۦ$ۥ۟۟$ۥ;-><init>()V

    sput-object v0, LYue/ۥ۠ۤۧۦ$ۥ۟۟;->ۥ۟:LYue/ۥ۠ۤۧۦ$ۥ۟۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟(LYue/ۥ۠ۤۧۦ;LYue/ۥۡۨۥۦ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۤۧۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۨۥۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "connection"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract ۥ۟۟۟۠(LYue/ۥ۠ۤۨ;)V
    .param p1    # LYue/ۥ۠ۤۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
