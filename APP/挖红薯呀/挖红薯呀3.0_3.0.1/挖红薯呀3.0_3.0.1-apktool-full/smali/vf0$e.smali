.class public final Lvf0$e;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvf0;->S2(Landroid/content/Context;Lhw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lxt0;

.field final synthetic e:Landroid/app/Dialog;

.field final synthetic f:Lhw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhw;"
        }
    .end annotation
.end field

.field final synthetic g:Landroid/widget/TextView;

.field final synthetic h:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lxt0;Landroid/app/Dialog;Lhw;Landroid/widget/TextView;Landroid/os/Handler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxt0;",
            "Landroid/app/Dialog;",
            "Lhw;",
            "Landroid/widget/TextView;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lvf0$e;->d:Lxt0;

    .line 2
    .line 3
    iput-object p2, p0, Lvf0$e;->e:Landroid/app/Dialog;

    .line 4
    .line 5
    iput-object p3, p0, Lvf0$e;->f:Lhw;

    .line 6
    .line 7
    iput-object p4, p0, Lvf0$e;->g:Landroid/widget/TextView;

    .line 8
    .line 9
    iput-object p5, p0, Lvf0$e;->h:Landroid/os/Handler;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lvf0$e;->d:Lxt0;

    .line 2
    .line 3
    iget v0, v0, Lxt0;->d:I

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lvf0$e;->e:Landroid/app/Dialog;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :catch_0
    iget-object p0, p0, Lvf0$e;->f:Lhw;

    .line 13
    .line 14
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v1, p0, Lvf0$e;->g:Landroid/widget/TextView;

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, "s \u540e\u8df3\u8f6c..."

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lvf0$e;->d:Lxt0;

    .line 41
    .line 42
    iget v1, v0, Lxt0;->d:I

    .line 43
    .line 44
    add-int/lit8 v1, v1, -0x1

    .line 45
    .line 46
    iput v1, v0, Lxt0;->d:I

    .line 47
    .line 48
    iget-object v0, p0, Lvf0$e;->h:Landroid/os/Handler;

    .line 49
    .line 50
    const-wide/16 v1, 0x3e8

    .line 51
    .line 52
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 53
    .line 54
    .line 55
    return-void
.end method
