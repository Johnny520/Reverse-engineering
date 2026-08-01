.class public final synthetic Lki0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Lli0;

.field public final synthetic ζ:I

.field public final synthetic η:I

.field public final synthetic θ:I


# direct methods
.method public synthetic constructor <init>(Lli0;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lki0;->ε:Lli0;

    .line 5
    .line 6
    iput p2, p0, Lki0;->ζ:I

    .line 7
    .line 8
    iput p3, p0, Lki0;->η:I

    .line 9
    .line 10
    iput p4, p0, Lki0;->θ:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lki0;->ε:Lli0;

    .line 2
    .line 3
    iget-object v0, v0, Lli0;->η:Landroid/widget/TextView;

    .line 4
    .line 5
    const-string v1, "/"

    .line 6
    .line 7
    const-string v2, " \u00b7 \u6210\u529f "

    .line 8
    .line 9
    const-string v3, "\u6b63\u5728\u6e05\u7406\u4e92\u52a8\u6d88\u606f "

    .line 10
    .line 11
    iget v4, p0, Lki0;->ζ:I

    .line 12
    .line 13
    iget v5, p0, Lki0;->η:I

    .line 14
    .line 15
    invoke-static {v3, v4, v1, v5, v2}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget p0, p0, Lki0;->θ:I

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Ls62;->α:Ls62;

    .line 32
    .line 33
    return-object p0
.end method
