.class public final synthetic La81;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Z

.field public final synthetic ζ:Ld81;

.field public final synthetic η:I

.field public final synthetic θ:Ls71;

.field public final synthetic ι:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZLd81;ILs71;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La81;->ε:Z

    .line 5
    .line 6
    iput-object p2, p0, La81;->ζ:Ld81;

    .line 7
    .line 8
    iput p3, p0, La81;->η:I

    .line 9
    .line 10
    iput-object p4, p0, La81;->θ:Ls71;

    .line 11
    .line 12
    iput-object p5, p0, La81;->ι:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, La81;->ε:Z

    .line 2
    .line 3
    iget-object v0, p0, La81;->ζ:Ld81;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget p0, p0, La81;->η:I

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ld81;->δ(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p1, p0, La81;->θ:Ls71;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p0, p1, Ls71;->η:Ls61;

    .line 18
    .line 19
    invoke-virtual {p0}, Ls61;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object p1, v0, Ld81;->α:Landroid/app/Activity;

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, La81;->ι:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, " \u5728\u5f53\u524d\u573a\u666f\u4e0d\u53ef\u7528"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const/4 v0, 0x0

    .line 45
    invoke-static {p1, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 50
    .line 51
    .line 52
    return-void
.end method
