.class public final synthetic Lhb/d0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Ljava/util/Calendar;

.field public final synthetic c:Lhb/i0;

.field public final synthetic d:Lhb/a0;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/util/Calendar;Lhb/i0;Lhb/a0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhb/d0;->a:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lhb/d0;->b:Ljava/util/Calendar;

    .line 7
    .line 8
    iput-object p3, p0, Lhb/d0;->c:Lhb/i0;

    .line 9
    .line 10
    iput-object p4, p0, Lhb/d0;->d:Lhb/a0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onDateSet(Landroid/widget/DatePicker;III)V
    .locals 9

    .line 1
    new-instance v0, Landroid/app/TimePickerDialog;

    .line 2
    .line 3
    new-instance v1, Lhb/v;

    .line 4
    .line 5
    iget-object v2, p0, Lhb/d0;->c:Lhb/i0;

    .line 6
    .line 7
    iget-object v3, p0, Lhb/d0;->a:Landroid/app/Activity;

    .line 8
    .line 9
    iget-object v4, p0, Lhb/d0;->b:Ljava/util/Calendar;

    .line 10
    .line 11
    iget-object v5, p0, Lhb/d0;->d:Lhb/a0;

    .line 12
    .line 13
    move v6, p2

    .line 14
    move v7, p3

    .line 15
    move v8, p4

    .line 16
    invoke-direct/range {v1 .. v8}, Lhb/v;-><init>(Lhb/i0;Landroid/app/Activity;Ljava/util/Calendar;Lhb/a0;III)V

    .line 17
    .line 18
    .line 19
    const/16 p1, 0xb

    .line 20
    .line 21
    invoke-virtual {v4, p1}, Ljava/util/Calendar;->get(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/16 p2, 0xc

    .line 26
    .line 27
    invoke-virtual {v4, p2}, Ljava/util/Calendar;->get(I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v5, 0x1

    .line 32
    move-object v2, v1

    .line 33
    move-object v1, v3

    .line 34
    move v3, p1

    .line 35
    invoke-direct/range {v0 .. v5}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/app/TimePickerDialog;->show()V

    .line 39
    .line 40
    .line 41
    return-void
.end method
