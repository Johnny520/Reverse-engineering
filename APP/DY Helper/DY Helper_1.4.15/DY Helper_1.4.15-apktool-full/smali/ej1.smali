.class public final synthetic Lej1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Ljava/lang/String;

.field public final synthetic θ:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p4, p0, Lej1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lej1;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lej1;->η:Ljava/lang/String;

    .line 6
    .line 7
    iput p3, p0, Lej1;->θ:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lej1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lej1;->η:Ljava/lang/String;

    .line 7
    .line 8
    iget v1, p0, Lej1;->θ:I

    .line 9
    .line 10
    iget-object p0, p0, Lej1;->ζ:Landroid/app/Activity;

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->δ(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lej1;->η:Ljava/lang/String;

    .line 17
    .line 18
    iget v1, p0, Lej1;->θ:I

    .line 19
    .line 20
    iget-object p0, p0, Lej1;->ζ:Landroid/app/Activity;

    .line 21
    .line 22
    invoke-static {p0, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->ζ(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
