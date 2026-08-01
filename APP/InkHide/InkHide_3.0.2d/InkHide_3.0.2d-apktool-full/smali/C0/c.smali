.class public final LC0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC0/c;

.field public static final b:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static volatile c:Ljava/lang/String;

.field public static volatile d:Ljava/lang/ref/WeakReference;

.field public static volatile e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LC0/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LC0/c;->a:LC0/c;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LC0/c;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    sput-object v0, LC0/c;->c:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method
