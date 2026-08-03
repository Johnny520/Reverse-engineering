.class public abstract Lc0/S0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:J

.field public static volatile b:Lc0/T0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc0/T0;

    invoke-direct {v0}, Lc0/T0;-><init>()V

    sput-object v0, Lc0/S0;->b:Lc0/T0;

    return-void
.end method
