.class public final synthetic Lhb/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/app/TimePickerDialog$OnTimeSetListener;


# instance fields
.field public final synthetic a:Lhb/i0;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Ljava/util/Calendar;

.field public final synthetic d:Lhb/a0;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Lhb/i0;Landroid/app/Activity;Ljava/util/Calendar;Lhb/a0;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhb/v;->a:Lhb/i0;

    .line 5
    .line 6
    iput-object p2, p0, Lhb/v;->b:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lhb/v;->c:Ljava/util/Calendar;

    .line 9
    .line 10
    iput-object p4, p0, Lhb/v;->d:Lhb/a0;

    .line 11
    .line 12
    iput p5, p0, Lhb/v;->e:I

    .line 13
    .line 14
    iput p6, p0, Lhb/v;->f:I

    .line 15
    .line 16
    iput p7, p0, Lhb/v;->g:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onTimeSet(Landroid/widget/TimePicker;II)V
    .locals 8

    .line 1
    const/16 p1, 0xd

    .line 2
    .line 3
    iget-object v0, p0, Lhb/v;->c:Ljava/util/Calendar;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    new-instance v0, Lhb/z;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    iget-object v1, p0, Lhb/v;->d:Lhb/a0;

    .line 13
    .line 14
    iget v2, p0, Lhb/v;->e:I

    .line 15
    .line 16
    iget v3, p0, Lhb/v;->f:I

    .line 17
    .line 18
    iget v4, p0, Lhb/v;->g:I

    .line 19
    .line 20
    move v5, p2

    .line 21
    move v6, p3

    .line 22
    invoke-direct/range {v0 .. v7}, Lhb/z;-><init>(Lfg/l;IIIIII)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lhb/v;->a:Lhb/i0;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance p2, Lhb/e0;

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    iget-object v1, p0, Lhb/v;->b:Landroid/app/Activity;

    .line 34
    .line 35
    invoke-direct {p2, v1, p1, v0, p3}, Lhb/e0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    new-instance p3, La1/d;

    .line 51
    .line 52
    const/16 v0, 0x12

    .line 53
    .line 54
    invoke-direct {p3, v1, v0, p2}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    invoke-virtual {p2}, Lhb/e0;->invoke()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-void
.end method
