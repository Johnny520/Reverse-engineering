.class public final Lum;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lhf;

.field public b:Z


# direct methods
.method public constructor <init>(LCx;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lhf;

    new-instance v1, Ltm;

    const-string v5, "readIfAbsent"

    const-string v6, "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z"

    const/4 v2, 0x2

    const-class v3, Lum;

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lpj;-><init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, p1, v1}, Lhf;-><init>(LCx;Ltm;)V

    iput-object v0, v4, Lum;->a:Lhf;

    return-void
.end method
