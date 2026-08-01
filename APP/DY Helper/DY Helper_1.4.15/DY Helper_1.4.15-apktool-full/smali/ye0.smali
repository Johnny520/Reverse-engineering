.class public final synthetic Lye0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/content/Context;

.field public final synthetic η:Lz81;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lz81;I)V
    .locals 0

    .line 1
    iput p3, p0, Lye0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lye0;->ζ:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lye0;->η:Lz81;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lye0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 7
    .line 8
    iget-object v1, p0, Lye0;->η:Lz81;

    .line 9
    .line 10
    iget-object v1, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 11
    .line 12
    iget-object p0, p0, Lye0;->ζ:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {v0, p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->init(Landroid/content/Context;Ljava/lang/ClassLoader;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;

    .line 21
    .line 22
    iget-object v1, p0, Lye0;->η:Lz81;

    .line 23
    .line 24
    iget-object v1, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 25
    .line 26
    iget-object p0, p0, Lye0;->ζ:Landroid/content/Context;

    .line 27
    .line 28
    invoke-virtual {v0, p0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->init(Landroid/content/Context;Ljava/lang/ClassLoader;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
