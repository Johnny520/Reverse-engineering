.class public final Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook$init$1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;->init(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $classLoader:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook$init$1;->$classLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    invoke-direct {p0}, Lm01;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;

    .line 5
    .line 6
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook$init$1;->$classLoader:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    const-string v0, "after onCreate"

    .line 9
    .line 10
    invoke-static {p1, p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;->access$dumpC11VB(Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;

    .line 5
    .line 6
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook$init$1;->$classLoader:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    const-string v0, "before onCreate"

    .line 9
    .line 10
    invoke-static {p1, p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;->access$dumpC11VB(Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
