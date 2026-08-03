.class public final synthetic Lye/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Lye/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lef/c;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lye/e;Ljava/lang/String;Lef/c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lye/d;->a:Lye/e;

    .line 5
    .line 6
    iput-object p2, p0, Lye/d;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lye/d;->c:Lef/c;

    .line 9
    .line 10
    iput-boolean p4, p0, Lye/d;->d:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p0, Lye/d;->a:Lye/e;

    .line 4
    .line 5
    iget-object p1, p1, Lye/e;->a:Lud/e;

    .line 6
    .line 7
    iget-object v0, p1, Lud/e;->k:Lud/u;

    .line 8
    .line 9
    iget-object v1, p1, Lud/e;->m:Lod/a;

    .line 10
    .line 11
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 12
    .line 13
    new-instance v3, Lod/c;

    .line 14
    .line 15
    iget-object v4, p0, Lye/d;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v3, v1, v4, v2}, Lod/c;-><init>(Lod/a;Ljava/lang/String;Lqd/j;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lud/u;->e:Lbe/k;

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Lbe/k;->h(Lod/c;)Lod/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lud/g;

    .line 27
    .line 28
    const/16 v2, 0x19

    .line 29
    .line 30
    invoke-direct {v1, p1, v0, v2}, Lud/g;-><init>(Lud/e;Lod/c;I)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lnc/a;

    .line 34
    .line 35
    iget-object v2, p0, Lye/d;->c:Lef/c;

    .line 36
    .line 37
    iget v2, v2, Lef/c;->a:I

    .line 38
    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const/4 v3, 0x6

    .line 44
    invoke-direct {v0, v3, v2}, Lnc/a;-><init>(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Lmd/e;->y(Loc/b;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v1}, Lud/e;->R(Lud/g;)V

    .line 51
    .line 52
    .line 53
    iget-boolean p1, p0, Lye/d;->d:Z

    .line 54
    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    const-string p1, "Added by JADX"

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Lnd/b0;->J(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    return-object v1
.end method
