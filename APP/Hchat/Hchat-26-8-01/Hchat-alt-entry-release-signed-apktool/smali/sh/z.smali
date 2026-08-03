.class public abstract Lsh/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li/r0;

.field public static final b:Li/l1;

.field public static final c:Li/l1;

.field public static final d:Li/l1;

.field public static final e:Li/l1;

.field public static final f:Li/r0;

.field public static final g:Lsh/y;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const v0, 0x38d1b717    # 1.0E-4f

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Li/r0;

    .line 9
    .line 10
    const v2, 0x3f51eb85    # 0.82f

    .line 11
    .line 12
    .line 13
    const v3, 0x43b54000    # 362.5f

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2, v3, v0}, Li/r0;-><init>(FFLjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lsh/z;->a:Li/r0;

    .line 20
    .line 21
    const/16 v1, 0xc8

    .line 22
    .line 23
    const/4 v4, 0x6

    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-static {v1, v4, v5}, Li/d;->p(IILi/v;)Li/l1;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sput-object v1, Lsh/z;->b:Li/l1;

    .line 30
    .line 31
    const/16 v1, 0x96

    .line 32
    .line 33
    invoke-static {v1, v4, v5}, Li/d;->p(IILi/v;)Li/l1;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sput-object v4, Lsh/z;->c:Li/l1;

    .line 38
    .line 39
    const/16 v4, 0x12c

    .line 40
    .line 41
    const/4 v5, 0x2

    .line 42
    sget-object v6, Lrh/a;->a:Lokio/a;

    .line 43
    .line 44
    invoke-static {v4, v5, v6}, Li/d;->p(IILi/v;)Li/l1;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    sput-object v4, Lsh/z;->d:Li/l1;

    .line 49
    .line 50
    invoke-static {v1, v5, v6}, Li/d;->p(IILi/v;)Li/l1;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sput-object v1, Lsh/z;->e:Li/l1;

    .line 55
    .line 56
    new-instance v1, Li/r0;

    .line 57
    .line 58
    invoke-direct {v1, v2, v3, v0}, Li/r0;-><init>(FFLjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sput-object v1, Lsh/z;->f:Li/r0;

    .line 62
    .line 63
    new-instance v0, Lsh/y;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lsh/z;->g:Lsh/y;

    .line 69
    .line 70
    return-void
.end method
