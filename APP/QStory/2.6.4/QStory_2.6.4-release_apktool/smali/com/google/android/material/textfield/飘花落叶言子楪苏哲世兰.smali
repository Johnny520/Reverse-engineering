.class public final synthetic Lcom/google/android/material/textfield/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p1, v0, :cond_2

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-object p0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;

    .line 14
    .line 15
    iget-wide v3, p0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏世兰:J

    .line 16
    .line 17
    sub-long/2addr v1, v3

    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    cmp-long p1, v1, v3

    .line 21
    .line 22
    if-ltz p1, :cond_0

    .line 23
    .line 24
    const-wide/16 v3, 0x12c

    .line 25
    .line 26
    cmp-long p1, v1, v3

    .line 27
    .line 28
    if-lez p1, :cond_1

    .line 29
    .line 30
    :cond_0
    iput-boolean p2, p0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世哲苏()V

    .line 33
    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 36
    .line 37
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    iput-wide v0, p0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏世兰:J

    .line 42
    .line 43
    :cond_2
    return p2
.end method
