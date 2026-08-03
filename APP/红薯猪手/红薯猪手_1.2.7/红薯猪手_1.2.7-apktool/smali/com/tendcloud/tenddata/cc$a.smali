.class public Lcom/tendcloud/tenddata/cc$a;
.super Lcom/tendcloud/tenddata/by$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/cc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/tendcloud/tenddata/cc;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/cc;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/cc$a;->this$0:Lcom/tendcloud/tenddata/cc;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/by$a;-><init>()V

    return-void
.end method


# virtual methods
.method public callback(IJZFDLjava/lang/String;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "SSSS"

    aput-object v2, v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OAIDCallback.callback("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p6, p7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v0, p2

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    return-void
.end method

.method public callback(ILandroid/os/Bundle;)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Ljava/lang/String;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "SSSS-AdvertisingIdPlatform"

    .line 6
    .line 7
    aput-object v3, v1, v2

    .line 8
    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v5, "OAIDCallBack handleResult retcode="

    .line 15
    .line 16
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v5, " retInfo="

    .line 23
    .line 24
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const/4 v5, 0x1

    .line 35
    aput-object v4, v1, v5

    .line 36
    .line 37
    invoke-static {v1}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    if-nez p2, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/cc$a;->this$0:Lcom/tendcloud/tenddata/cc;

    .line 46
    .line 47
    iget-object p1, p1, Lcom/tendcloud/tenddata/cc;->a:Lcom/tendcloud/tenddata/cb$a;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    const-string v1, "oa_id_flag"

    .line 52
    .line 53
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iput-object p2, p1, Lcom/tendcloud/tenddata/cb$a;->id:Ljava/lang/String;

    .line 58
    .line 59
    new-array p1, v0, [Ljava/lang/String;

    .line 60
    .line 61
    aput-object v3, p1, v2

    .line 62
    .line 63
    const-string p2, "OAIDCallBack handleResult success:"

    .line 64
    .line 65
    invoke-static {p2}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iget-object v0, p0, Lcom/tendcloud/tenddata/cc$a;->this$0:Lcom/tendcloud/tenddata/cc;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/tendcloud/tenddata/cc;->a:Lcom/tendcloud/tenddata/cb$a;

    .line 72
    .line 73
    iget-object v0, v0, Lcom/tendcloud/tenddata/cb$a;->id:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    aput-object p2, p1, v5

    .line 83
    .line 84
    invoke-static {p1}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    :goto_0
    new-array p2, v0, [Ljava/lang/String;

    .line 89
    .line 90
    aput-object v3, p2, v2

    .line 91
    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v1, "OAIDCallBack handleResult error retcode=$ "

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    aput-object p1, p2, v5

    .line 110
    .line 111
    invoke-static {p2}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/cc$a;->this$0:Lcom/tendcloud/tenddata/cc;

    .line 115
    .line 116
    iget-object p1, p1, Lcom/tendcloud/tenddata/cc;->b:Ljava/util/concurrent/CountDownLatch;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 119
    .line 120
    .line 121
    return-void
.end method
