.class public final Leg;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Leg;

.field public static final c:Leg;


# instance fields
.field public final a:Ldg;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Leg;

    new-instance v1, Lm6;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lm6;-><init>(I)V

    invoke-direct {v0, v1}, Leg;-><init>(Lm6;)V

    sput-object v0, Leg;->b:Leg;

    new-instance v0, Leg;

    new-instance v1, Lm6;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lm6;-><init>(I)V

    invoke-direct {v0, v1}, Leg;-><init>(Lm6;)V

    sput-object v0, Leg;->c:Leg;

    new-instance v0, Leg;

    new-instance v1, Lm6;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lm6;-><init>(I)V

    invoke-direct {v0, v1}, Leg;-><init>(Lm6;)V

    new-instance v0, Leg;

    new-instance v1, Lm6;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lm6;-><init>(I)V

    invoke-direct {v0, v1}, Leg;-><init>(Lm6;)V

    new-instance v0, Leg;

    new-instance v1, Lm6;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lm6;-><init>(I)V

    invoke-direct {v0, v1}, Leg;-><init>(Lm6;)V

    new-instance v0, Leg;

    new-instance v1, Lm6;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lm6;-><init>(I)V

    invoke-direct {v0, v1}, Leg;-><init>(Lm6;)V

    new-instance v0, Leg;

    new-instance v1, Lm6;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lm6;-><init>(I)V

    invoke-direct {v0, v1}, Leg;-><init>(Lm6;)V

    return-void
.end method

.method public constructor <init>(Lm6;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LhB;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ldg;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Ldg;-><init>(Lm6;I)V

    iput-object v0, p0, Leg;->a:Ldg;

    return-void

    :cond_0
    const-string v0, "java.vendor"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "The Android Project"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ldg;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ldg;-><init>(Lm6;I)V

    iput-object v0, p0, Leg;->a:Ldg;

    return-void

    :cond_1
    new-instance v0, Ldg;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ldg;-><init>(Lm6;I)V

    iput-object v0, p0, Leg;->a:Ldg;

    return-void
.end method
