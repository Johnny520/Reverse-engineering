.class public final synthetic Ljj1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Ljj1;->ε:I

    .line 2
    .line 3
    iput-object p3, p0, Ljj1;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput p1, p0, Ljj1;->η:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Ljj1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljj1;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    iget p0, p0, Ljj1;->η:I

    .line 9
    .line 10
    invoke-static {p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->ε(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Ljj1;->ζ:Ljava/lang/Object;

    .line 15
    .line 16
    iget p0, p0, Ljj1;->η:I

    .line 17
    .line 18
    invoke-static {p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->δ(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object v0, p0, Ljj1;->ζ:Ljava/lang/Object;

    .line 23
    .line 24
    iget p0, p0, Ljj1;->η:I

    .line 25
    .line 26
    invoke-static {p0, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->ζ(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
