.class public abstract Lw/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li0/u;

.field public static final b:Li0/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk/s1;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lk/s1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Li0/u;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Li0/u;-><init>(Lfg/a;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lw/f;->a:Li0/u;

    .line 14
    .line 15
    new-instance v0, Li0/u;

    .line 16
    .line 17
    sget-object v1, Lw/e;->g:Lw/e;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Li0/u;-><init>(Lfg/a;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lw/f;->b:Li0/u;

    .line 23
    .line 24
    return-void
.end method
