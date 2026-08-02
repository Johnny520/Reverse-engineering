.class public abstract Lwt2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Z

.field public static final b:Lrt2$a;

.field public static final c:Lst2$a;

.field public static final d:Ltt2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    const-string v2, "java.sql.Date"

    .line 4
    .line 5
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    move v2, v1

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move v2, v0

    .line 11
    :goto_0
    sput-boolean v2, Lwt2;->a:Z

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    new-instance v2, Lvt2;

    .line 16
    .line 17
    const-class v3, Ljava/sql/Date;

    .line 18
    .line 19
    invoke-direct {v2, v0, v3}, Lvt2;-><init>(ILjava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lvt2;

    .line 23
    .line 24
    const-class v2, Ljava/sql/Timestamp;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, Lvt2;-><init>(ILjava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lrt2;->b:Lrt2$a;

    .line 30
    .line 31
    sput-object v0, Lwt2;->b:Lrt2$a;

    .line 32
    .line 33
    sget-object v0, Lst2;->b:Lst2$a;

    .line 34
    .line 35
    sput-object v0, Lwt2;->c:Lst2$a;

    .line 36
    .line 37
    sget-object v0, Lut2;->b:Ltt2;

    .line 38
    .line 39
    sput-object v0, Lwt2;->d:Ltt2;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    sput-object v0, Lwt2;->b:Lrt2$a;

    .line 44
    .line 45
    sput-object v0, Lwt2;->c:Lst2$a;

    .line 46
    .line 47
    sput-object v0, Lwt2;->d:Ltt2;

    .line 48
    .line 49
    :goto_1
    return-void
.end method
