.class public final Lfj;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg8;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lfj;->d:I

    iput-object p1, p0, Lfj;->e:Ljava/lang/Object;

    .line 22
    invoke-direct {p0, v0}, Lfj;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Lv3;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lfj;->d:I

    iput-object p1, p0, Lfj;->e:Ljava/lang/Object;

    .line 21
    invoke-direct {p0, v0}, Lfj;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lfj;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-boolean p1, p0, Lfj;->b:Z

    .line 12
    .line 13
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lfj;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ldj;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c(Ldj;)V
    .locals 0

    .line 1
    return-void
.end method
