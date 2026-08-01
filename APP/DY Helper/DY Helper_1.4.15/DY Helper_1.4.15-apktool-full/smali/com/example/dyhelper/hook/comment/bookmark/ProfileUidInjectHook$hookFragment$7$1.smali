.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook$hookFragment$7$1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->hookFragment(Ljava/lang/ClassLoader;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;


# direct methods
.method public constructor <init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook$hookFragment$7$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

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
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook$hookFragment$7$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 5
    .line 6
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->access$cleanup(Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
