.class public final synthetic Lr0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lr0/w;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/view/View;

.field public final synthetic e:J

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Lr0/w;Ljava/lang/Object;Ljava/lang/String;Landroid/view/View;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/t;->a:Lr0/w;

    iput-object p2, p0, Lr0/t;->b:Ljava/lang/Object;

    iput-object p3, p0, Lr0/t;->c:Ljava/lang/String;

    iput-object p4, p0, Lr0/t;->d:Landroid/view/View;

    iput-wide p5, p0, Lr0/t;->e:J

    iput p7, p0, Lr0/t;->f:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lr0/t;->a:Lr0/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lz0/r;->t()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget-object v2, p0, Lr0/t;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v3, p0, Lr0/t;->c:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3}, Lr0/w;->b(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v0, v2}, Lr0/w;->f(Ljava/lang/Object;)Landroid/widget/EditText;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v3}, Lr0/w;->a(Landroid/widget/EditText;Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    :goto_0
    iget-object v2, p0, Lr0/t;->d:Landroid/view/View;

    .line 34
    .line 35
    iget v0, v0, Lr0/w;->e:I

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v2, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v1, "delay="

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-wide v1, p0, Lr0/t;->e:J

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "chat command watcher attached by retry"

    .line 61
    .line 62
    filled-new-array {v1, v3, v0}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    const/4 v1, 0x3

    .line 71
    iget v4, p0, Lr0/t;->f:I

    .line 72
    .line 73
    if-ne v4, v1, :cond_3

    .line 74
    .line 75
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {v2, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const-string v0, "chat command input not found after retry"

    .line 81
    .line 82
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    return-void
.end method
