.class public final synthetic Lnj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/ClassLoader;

.field public final synthetic η:Ljava/util/List;

.field public final synthetic θ:Landroid/app/Activity;

.field public final synthetic ι:La80;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Ljava/util/List;Landroid/app/Activity;La80;I)V
    .locals 0

    .line 1
    iput p5, p0, Lnj;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lnj;->ζ:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    iput-object p2, p0, Lnj;->η:Ljava/util/List;

    .line 6
    .line 7
    iput-object p3, p0, Lnj;->θ:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p4, p0, Lnj;->ι:La80;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lnj;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnj;->θ:Landroid/app/Activity;

    .line 7
    .line 8
    iget-object v1, p0, Lnj;->ι:La80;

    .line 9
    .line 10
    iget-object v2, p0, Lnj;->ζ:Ljava/lang/ClassLoader;

    .line 11
    .line 12
    iget-object p0, p0, Lnj;->η:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v2, p0, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkActiveQuery;->β(Ljava/lang/ClassLoader;Ljava/util/List;Landroid/app/Activity;La80;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lnj;->θ:Landroid/app/Activity;

    .line 19
    .line 20
    iget-object v1, p0, Lnj;->ι:La80;

    .line 21
    .line 22
    iget-object v2, p0, Lnj;->ζ:Ljava/lang/ClassLoader;

    .line 23
    .line 24
    iget-object p0, p0, Lnj;->η:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {v2, p0, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->γ(Ljava/lang/ClassLoader;Ljava/util/List;Landroid/app/Activity;La80;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
