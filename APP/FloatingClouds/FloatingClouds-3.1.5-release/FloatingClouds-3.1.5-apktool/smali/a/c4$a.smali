.class public final La/c4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/x4$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/c4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/x4$b<",
        "La/c4;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic a:La/c4$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/c4$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/c4$a;->a:La/c4$a;

    return-void
.end method
