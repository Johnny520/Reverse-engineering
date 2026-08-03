.class public final La/E2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/E2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:La/E2$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/E2$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/E2$a;->a:La/E2$a;

    return-void
.end method
