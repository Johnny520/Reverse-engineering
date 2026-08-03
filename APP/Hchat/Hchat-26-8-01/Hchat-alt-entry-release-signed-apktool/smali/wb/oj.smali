.class public final synthetic Lwb/oj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Ljava/util/Calendar;

.field public final synthetic c:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/util/Calendar;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/oj;->a:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/oj;->b:Ljava/util/Calendar;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/oj;->c:Lfg/l;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onDateSet(Landroid/widget/DatePicker;III)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/app/TimePickerDialog;

    .line 5
    .line 6
    new-instance v1, Lwb/pj;

    .line 7
    .line 8
    iget-object v2, p0, Lwb/oj;->a:Landroid/app/Activity;

    .line 9
    .line 10
    iget-object v3, p0, Lwb/oj;->b:Ljava/util/Calendar;

    .line 11
    .line 12
    iget-object v4, p0, Lwb/oj;->c:Lfg/l;

    .line 13
    .line 14
    move v5, p2

    .line 15
    move v6, p3

    .line 16
    move v7, p4

    .line 17
    invoke-direct/range {v1 .. v7}, Lwb/pj;-><init>(Landroid/app/Activity;Ljava/util/Calendar;Lfg/l;III)V

    .line 18
    .line 19
    .line 20
    const/16 p1, 0xb

    .line 21
    .line 22
    invoke-virtual {v3, p1}, Ljava/util/Calendar;->get(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/16 p2, 0xc

    .line 27
    .line 28
    invoke-virtual {v3, p2}, Ljava/util/Calendar;->get(I)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x1

    .line 33
    move-object v3, v2

    .line 34
    move-object v2, v1

    .line 35
    move-object v1, v3

    .line 36
    move v3, p1

    .line 37
    invoke-direct/range {v0 .. v5}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/app/TimePickerDialog;->show()V

    .line 41
    .line 42
    .line 43
    return-void
.end method
