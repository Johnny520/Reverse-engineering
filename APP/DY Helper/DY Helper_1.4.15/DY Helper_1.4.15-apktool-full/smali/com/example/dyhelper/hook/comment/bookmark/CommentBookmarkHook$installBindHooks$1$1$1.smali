.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook$installBindHooks$1$1$1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->installBindHooks(Ljava/lang/ClassLoader;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;


# direct methods
.method public constructor <init>(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook$installBindHooks$1$1$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;

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
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook$installBindHooks$1$1$1;->$this_runCatching:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;

    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->access$handleAfterBind(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;Lk01;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
