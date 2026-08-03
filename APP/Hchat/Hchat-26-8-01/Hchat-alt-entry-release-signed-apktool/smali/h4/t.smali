.class public final Lh4/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lv4/d0;

.field public final b:Lv4/d0;

.field public final c:Lv4/c0;

.field public final d:I


# direct methods
.method public constructor <init>(Lv4/d0;Lv4/d0;Lv4/c0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lh4/t;->a:Lv4/d0;

    .line 7
    .line 8
    iput-object p2, p0, Lh4/t;->b:Lv4/d0;

    .line 9
    .line 10
    iput-object p3, p0, Lh4/t;->c:Lv4/c0;

    .line 11
    .line 12
    iput p4, p0, Lh4/t;->d:I

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p1, "innerClass == null"

    .line 16
    .line 17
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1
.end method
