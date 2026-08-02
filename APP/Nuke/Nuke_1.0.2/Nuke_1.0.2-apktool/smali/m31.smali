.class public final Lm31;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lud0;

.field public b:Z


# direct methods
.method public constructor <init>(Lyo2;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lud0;

    .line 8
    .line 9
    new-instance v1, Lml0;

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v9, 0x2

    .line 13
    const/4 v2, 0x2

    .line 14
    const-class v4, Lm31;

    .line 15
    .line 16
    const-string v5, "readIfAbsent"

    .line 17
    .line 18
    const-string v6, "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z"

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    move-object v3, p0

    .line 22
    invoke-direct/range {v1 .. v9}, Lml0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p1, v1}, Lud0;-><init>(Lyo2;Lml0;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, v3, Lm31;->a:Lud0;

    .line 29
    .line 30
    return-void
.end method
