.class public final synthetic Lo9/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lo9/d;->g:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    check-cast p2, Lo9/l;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance p1, Lo9/l;

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    iget p2, p2, Lo9/l;->a:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    :goto_0
    add-int/lit8 p2, p2, 0x1

    .line 17
    .line 18
    iget-wide v0, p0, Lo9/d;->g:J

    .line 19
    .line 20
    invoke-direct {p1, p2, v0, v1}, Lo9/l;-><init>(IJ)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method
