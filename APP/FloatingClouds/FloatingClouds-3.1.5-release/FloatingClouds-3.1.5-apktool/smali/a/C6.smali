.class public final La/C6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Pd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        "E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "La/Pd<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final a:La/Pd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/Pd<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:La/kd;


# direct methods
.method public constructor <init>(La/Pd;La/kd;)V
    .locals 1

    sget-object v0, La/Td;->i:La/Td;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/C6;->a:La/Pd;

    iput-object p2, p0, La/C6;->b:La/kd;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, La/C6$a;

    invoke-direct {v0, p0}, La/C6$a;-><init>(La/C6;)V

    return-object v0
.end method
