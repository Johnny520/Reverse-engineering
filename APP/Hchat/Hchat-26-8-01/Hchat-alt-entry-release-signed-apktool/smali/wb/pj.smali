.class public final synthetic Lwb/pj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/app/TimePickerDialog$OnTimeSetListener;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Ljava/util/Calendar;

.field public final synthetic c:Lfg/l;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/util/Calendar;Lfg/l;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/pj;->a:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/pj;->b:Ljava/util/Calendar;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/pj;->c:Lfg/l;

    .line 9
    .line 10
    iput p4, p0, Lwb/pj;->d:I

    .line 11
    .line 12
    iput p5, p0, Lwb/pj;->e:I

    .line 13
    .line 14
    iput p6, p0, Lwb/pj;->f:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onTimeSet(Landroid/widget/TimePicker;II)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p1, 0xd

    .line 5
    .line 6
    iget-object v0, p0, Lwb/pj;->b:Ljava/util/Calendar;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->get(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    new-instance v0, Lhb/z;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    iget-object v1, p0, Lwb/pj;->c:Lfg/l;

    .line 16
    .line 17
    iget v2, p0, Lwb/pj;->d:I

    .line 18
    .line 19
    iget v3, p0, Lwb/pj;->e:I

    .line 20
    .line 21
    iget v4, p0, Lwb/pj;->f:I

    .line 22
    .line 23
    move v5, p2

    .line 24
    move v6, p3

    .line 25
    invoke-direct/range {v0 .. v7}, Lhb/z;-><init>(Lfg/l;IIIIII)V

    .line 26
    .line 27
    .line 28
    new-instance p2, Lhb/e0;

    .line 29
    .line 30
    const/16 p3, 0xc

    .line 31
    .line 32
    iget-object v1, p0, Lwb/pj;->a:Landroid/app/Activity;

    .line 33
    .line 34
    invoke-direct {p2, v1, p1, v0, p3}, Lhb/e0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    new-instance p3, Lrb/g;

    .line 50
    .line 51
    const/16 v0, 0xb

    .line 52
    .line 53
    invoke-direct {p3, v1, v0, p2}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    invoke-virtual {p2}, Lhb/e0;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    return-void
.end method
