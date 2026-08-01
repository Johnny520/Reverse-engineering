.class public abstract Ly01;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Ldw0;

.field public static final b:Ldw0;

.field public static final c:Ldw0;

.field public static final d:Ldw0;

.field public static final e:Ldw0;

.field public static final f:Ldw0;

.field public static final g:Ldw0;

.field public static final h:Ldw0;

.field public static final i:Lop;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La11;->d:Ldw0;

    .line 2
    .line 3
    sput-object v0, Ly01;->a:Ldw0;

    .line 4
    .line 5
    sget-object v0, La11;->h:Ldw0;

    .line 6
    .line 7
    sput-object v0, Ly01;->b:Ldw0;

    .line 8
    .line 9
    sget-object v0, La11;->g:Ldw0;

    .line 10
    .line 11
    sput-object v0, Ly01;->c:Ldw0;

    .line 12
    .line 13
    sget-object v0, La11;->e:Ldw0;

    .line 14
    .line 15
    sput-object v0, Ly01;->d:Ldw0;

    .line 16
    .line 17
    sget-object v0, La11;->f:Ldw0;

    .line 18
    .line 19
    sput-object v0, Ly01;->e:Ldw0;

    .line 20
    .line 21
    sget-object v0, La11;->b:Ldw0;

    .line 22
    .line 23
    sput-object v0, Ly01;->f:Ldw0;

    .line 24
    .line 25
    sget-object v0, La11;->c:Ldw0;

    .line 26
    .line 27
    sput-object v0, Ly01;->g:Ldw0;

    .line 28
    .line 29
    sget-object v0, La11;->a:Ldw0;

    .line 30
    .line 31
    sput-object v0, Ly01;->h:Ldw0;

    .line 32
    .line 33
    sget-object v0, La11;->i:Lop;

    .line 34
    .line 35
    sput-object v0, Ly01;->i:Lop;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    const/high16 v1, 0x42c80000    # 100.0f

    .line 39
    .line 40
    cmpg-float v0, v1, v0

    .line 41
    .line 42
    if-ltz v0, :cond_0

    .line 43
    .line 44
    cmpl-float v0, v1, v1

    .line 45
    .line 46
    if-lez v0, :cond_1

    .line 47
    .line 48
    :cond_0
    const-string v0, "The percent should be in the range of [0, 100]"

    .line 49
    .line 50
    invoke-static {v0}, Lz10;->a(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method
