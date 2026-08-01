.class public final synthetic LA0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:LA0/u;

.field public final synthetic c:I

.field public final synthetic d:Ljava/util/ArrayList;

.field public final synthetic e:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;LA0/u;ILjava/util/ArrayList;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/p;->a:Landroid/widget/TextView;

    iput-object p2, p0, LA0/p;->b:LA0/u;

    iput p3, p0, LA0/p;->c:I

    iput-object p4, p0, LA0/p;->d:Ljava/util/ArrayList;

    iput-object p5, p0, LA0/p;->e:Landroid/widget/LinearLayout;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, LA0/p;->b:LA0/u;

    .line 2
    .line 3
    iget-object v0, v0, LA0/u;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget v1, p0, LA0/p;->c:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0x1

    .line 8
    .line 9
    iget-object v3, p0, LA0/p;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    new-instance v4, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v5, "\u6b63\u5728\u9002\u914d\uff1a"

    .line 18
    .line 19
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, "\uff08"

    .line 26
    .line 27
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, "/"

    .line 34
    .line 35
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, "\uff09"

    .line 42
    .line 43
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v2, p0, LA0/p;->a:Landroid/widget/TextView;

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, LA0/p;->e:Landroid/widget/LinearLayout;

    .line 56
    .line 57
    const-string v2, "progress"

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Landroid/widget/ProgressBar;

    .line 64
    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void
.end method
