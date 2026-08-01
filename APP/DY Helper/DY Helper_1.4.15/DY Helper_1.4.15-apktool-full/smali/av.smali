.class public final synthetic Lav;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Landroid/widget/EditText;

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Landroid/widget/EditText;

.field public final synthetic ι:Landroid/widget/TextView;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lum1;Landroid/app/Activity;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lav;->ε:Landroid/widget/EditText;

    .line 2
    .line 3
    iput-object p2, p0, Lav;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p1, p0, Lav;->η:Lum1;

    .line 6
    .line 7
    iput-object p4, p0, Lav;->θ:Landroid/widget/EditText;

    .line 8
    .line 9
    iput-object p5, p0, Lav;->ι:Landroid/widget/TextView;

    .line 10
    .line 11
    iput-object p6, p0, Lav;->κ:Landroid/widget/TextView;

    .line 12
    .line 13
    iput-object p7, p0, Lav;->λ:Landroid/widget/TextView;

    .line 14
    .line 15
    const-string p4, "showInternal$insertToken(Landroid/widget/EditText;Landroid/app/Activity;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/EditText;Lcom/example/dyhelper/model/AwemeInfo;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;)V"

    .line 16
    .line 17
    const/4 p5, 0x0

    .line 18
    const/4 p1, 0x1

    .line 19
    const-class p2, Lkn0;

    .line 20
    .line 21
    const-string p3, "insertToken"

    .line 22
    .line 23
    invoke-direct/range {p0 .. p5}, Lp80;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lav;->ε:Landroid/widget/EditText;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-gez v2, :cond_1

    .line 21
    .line 22
    move v2, v3

    .line 23
    :cond_1
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-gez v4, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move v3, v4

    .line 31
    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-interface {v1, v4, v2, p1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    add-int/2addr p1, v4

    .line 47
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-le p1, v1, :cond_3

    .line 52
    .line 53
    move p1, v1

    .line 54
    :cond_3
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 58
    .line 59
    .line 60
    new-instance p1, Lqu;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    iget-object v2, p0, Lav;->ζ:Landroid/app/Activity;

    .line 64
    .line 65
    invoke-direct {p1, v2, v0, v1}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 66
    .line 67
    .line 68
    const-wide/16 v1, 0x78

    .line 69
    .line 70
    invoke-virtual {v0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lav;->η:Lum1;

    .line 74
    .line 75
    iget-object v2, p0, Lav;->θ:Landroid/widget/EditText;

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    iget-object v4, p0, Lav;->ι:Landroid/widget/TextView;

    .line 79
    .line 80
    iget-object v5, p0, Lav;->κ:Landroid/widget/TextView;

    .line 81
    .line 82
    iget-object v6, p0, Lav;->λ:Landroid/widget/TextView;

    .line 83
    .line 84
    invoke-static/range {v0 .. v6}, Lh62;->Е(Landroid/widget/EditText;Lum1;Landroid/widget/EditText;Lf8;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 88
    .line 89
    return-object p0
.end method
