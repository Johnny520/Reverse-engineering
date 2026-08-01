.class final Lm00$b;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm00;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field final synthetic b:Lm00;


# direct methods
.method public constructor <init>(Lm00;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lm00$b;->b:Lm00;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 p1, 0x50

    .line 7
    .line 8
    iput p1, p0, Lm00$b;->a:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return p3

    .line 8
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    sub-float/2addr p2, p1

    .line 17
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget p4, p0, Lm00$b;->a:I

    .line 22
    .line 23
    int-to-float p4, p4

    .line 24
    cmpl-float p1, p1, p4

    .line 25
    .line 26
    if-lez p1, :cond_2

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    cmpg-float p1, p2, p1

    .line 30
    .line 31
    iget-object p0, p0, Lm00$b;->b:Lm00;

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    if-gez p1, :cond_1

    .line 35
    .line 36
    invoke-static {p0}, Lm00;->q1(Lm00;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    add-int/2addr p1, p2

    .line 41
    invoke-static {p0, p1}, Lm00;->t2(Lm00;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-static {p0}, Lm00;->q1(Lm00;)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    sub-int/2addr p1, p2

    .line 50
    invoke-static {p0, p1}, Lm00;->t2(Lm00;I)V

    .line 51
    .line 52
    .line 53
    :goto_0
    return p2

    .line 54
    :cond_2
    return p3
.end method
