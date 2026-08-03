.class public final LXf;
.super LAA;
.source ""


# instance fields
.field public final synthetic a:Lag;


# direct methods
.method public constructor <init>(Lag;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXf;->a:Lag;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    iget-object p1, p0, LXf;->a:Lag;

    invoke-virtual {p1}, Lag;->b()Lbg;

    move-result-object p1

    invoke-virtual {p1}, Lbg;->a()V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget-object p1, p0, LXf;->a:Lag;

    invoke-virtual {p1}, Lag;->b()Lbg;

    move-result-object p1

    invoke-virtual {p1}, Lbg;->b()V

    return-void
.end method
