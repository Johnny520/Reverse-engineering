.class public final synthetic Lcom/example/dyhelper/hook/α;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/example/dyhelper/hook/α;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/example/dyhelper/hook/α;->ζ:Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/α;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object p0, p0, Lcom/example/dyhelper/hook/α;->ζ:Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ι:Z

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-lez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->δ()V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :pswitch_0
    iget-object p0, p0, Lcom/example/dyhelper/hook/α;->ζ:Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 36
    .line 37
    iget v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-lez v0, :cond_2

    .line 52
    .line 53
    iget-boolean v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε:Z

    .line 54
    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->δ()V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    sget v0, Lh20;->δ:F

    .line 62
    .line 63
    invoke-static {p0, v0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->β(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;F)V

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_0
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
